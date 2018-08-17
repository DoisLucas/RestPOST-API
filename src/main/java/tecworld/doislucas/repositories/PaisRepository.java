package tecworld.doislucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tecworld.doislucas.models.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
}
