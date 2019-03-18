package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.models.Pais;
import tecworld.doislucas.services.ContinenteService;
import tecworld.doislucas.services.PaisService;

import java.util.List;

import static tecworld.doislucas.Utils.Utils.removerAcentos;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class indexController {

    @Autowired
    private ContinenteService continenteService;
    @Autowired
    private PaisService paisService;

    @GetMapping(value = "/paises")
    public List<Pais> PaisesParam(@RequestParam(value = "nome") String nome){ return paisService.findOneName(removerAcentos(nome)); }

    @GetMapping(value = "/continentes")
    public List<Continente> allContinentes(@RequestParam(value = "nome", required = false) String name) {
        return name != null ? continenteService.findByName(removerAcentos(name)) : continenteService.findAll();
    }

    @GetMapping(value = "/continentes/{id}")
    public Continente ContinenteByID(@PathVariable("id") int id) {
        return continenteService.findById(id);
    }

    @GetMapping(value = "/continentes/{id}/paises")
    public List<Pais> PaisByContinente(@PathVariable("id") int id) {
        return continenteService.findById(id).getPaises();
    }

    @GetMapping(value = "/continentes/{id}/paises/{id2}")
    public Pais PaisByID(@PathVariable("id") int id, @PathVariable("id2") int id2) {
        return paisService.findOneIDs(id,id2);
    }

}
