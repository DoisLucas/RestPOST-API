package tecworld.doislucas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.services.ContinenteService;

@SpringBootApplication
public class DoislucasApplication {

    public static void main(String[] args) { SpringApplication.run(DoislucasApplication.class, args); }

}
