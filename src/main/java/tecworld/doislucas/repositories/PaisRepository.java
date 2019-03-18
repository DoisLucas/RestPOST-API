package tecworld.doislucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tecworld.doislucas.models.Pais;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

    @Query(value = "SELECT * FROM tab_pais p WHERE LOWER(unaccent(p.nome)) = LOWER(:nome)", nativeQuery = true)
    List<Pais> findOneName(@Param("nome") String nome);

    @Query(value = "SELECT * FROM tab_pais p WHERE p.id = :id1 AND p.c_id = :id", nativeQuery = true)
    Pais findOneIDs(@Param("id") int id, @Param("id1") int id1);

}
