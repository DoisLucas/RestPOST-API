package tecworld.doislucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.models.Pais;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Integer> {
}
