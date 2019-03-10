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
    EmailRepository er;

    public void addEmail(Email email){
            er.save(email);
    }

}
