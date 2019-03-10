package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tecworld.doislucas.models.Email;
import tecworld.doislucas.services.EmailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class emailController {

    @Autowired
    private EmailService es;

    @PostMapping(value = "/email")
    public Object catchEmail(@RequestBody Email email) {
        try {
            es.addEmail(email);
            return email;
        } catch (DataIntegrityViolationException e) {
            return "210 (Alrady Exists)";
        }
    }

}

