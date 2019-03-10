package tecworld.doislucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tecworld.doislucas.models.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
}
