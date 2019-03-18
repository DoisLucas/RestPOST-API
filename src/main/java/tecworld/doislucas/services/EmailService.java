package tecworld.doislucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tecworld.doislucas.models.Email;
import tecworld.doislucas.repositories.EmailRepository;

@Service
@Primary
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public Email addEmail(Email email) {
        return emailRepository.save(email);
    }

}
