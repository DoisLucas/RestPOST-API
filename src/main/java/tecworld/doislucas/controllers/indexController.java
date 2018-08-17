package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.models.Pais;
import tecworld.doislucas.services.ContinenteService;

import java.util.List;

@RestController
public class indexController {

    @Autowired
    private ContinenteService ccs;

    //Requisições GET

    @RequestMapping(value = "/continentes", method = RequestMethod.GET)
    public List<Continente> allContinentes() { return ccs.findAll(); }

    @RequestMapping(value = "/continentes/{id}", method = RequestMethod.GET)
    public Continente ContinenteByID(@PathVariable("id") int id) { return ccs.findOne(id); }

    @RequestMapping(value = "/continentes/{id}/paises", method = RequestMethod.GET)
    public List<Pais> PaisByContinente(@PathVariable("id") int id) {
        Continente escolhido = ccs.findOne(id);
        return escolhido.getPaises();
    }

    @RequestMapping(value = "/continentes/{id}/paises/{id2}", method = RequestMethod.GET)
    public Pais PaisByID(@PathVariable("id") int id, @PathVariable("id2") int id2) {

        Continente escolhido = ccs.findOne(id);

        for (Pais p : escolhido.getPaises()) {
            if (p.getId() == id2) {
                return p;
            }
        }
        return null;
    }

}
