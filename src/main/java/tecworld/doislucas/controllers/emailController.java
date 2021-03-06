package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private EmailService emailService;

    @PostMapping(value = "/email")
    public ResponseEntity<?> catchEmail(@RequestBody Email email) {
            return ResponseEntity.status(HttpStatus.CREATED).body( emailService.addEmail(email) );
    }

}

