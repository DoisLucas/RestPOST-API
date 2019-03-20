package tecworld.doislucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import tecworld.doislucas.models.Email;
import tecworld.doislucas.repositories.EmailRepository;
import tecworld.doislucas.services.exceptions.EmailDuplicatedException;

@Service
@Primary
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public Email addEmail(Email email) {

        try {
            return emailRepository.save(email);
        } catch (DataIntegrityViolationException e) {
            throw new EmailDuplicatedException("Email já existente na base de dados!");
        }

    }

}
