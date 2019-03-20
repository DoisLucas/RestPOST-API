package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Pais>> PaisesParam(@RequestParam(value = "nome") String nome) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paisService.findOneName(removerAcentos(nome)));
    }

    @GetMapping(value = "/continentes")
    public ResponseEntity<List<Continente>> allContinentes(@RequestParam(value = "nome", required = false) String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(name != null ? continenteService.findByName(removerAcentos(name)) : continenteService.findAll());
    }

    @GetMapping(value = "/continentes/{id}")
    public ResponseEntity<Continente> ContinenteByID(@PathVariable("id") int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(continenteService.findById(id));
    }

    @GetMapping(value = "/continentes/{id}/paises")
    public ResponseEntity<List<Pais>> PaisByContinente(@PathVariable("id") int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(continenteService.findById(id).getPaises());
    }

    @GetMapping(value = "/continentes/{id}/paises/{id2}")
    public ResponseEntity<Pais> PaisByID(@PathVariable("id") int id, @PathVariable("id2") int id2) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paisService.findOneIDs(id, id2));
    }

}
