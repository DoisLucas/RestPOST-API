package tecworld.doislucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.models.Pais;

import java.util.List;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Integer> {

    @Query(value = "SELECT * FROM tab_continente p WHERE LOWER(unaccent(p.nome)) = LOWER(:nome)", nativeQuery = true)
    public List<Continente> findByName(@Param("nome") String nome);

}
