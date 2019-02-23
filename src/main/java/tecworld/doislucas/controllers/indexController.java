package tecworld.doislucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.models.Pais;
import tecworld.doislucas.services.ContinenteService;
import tecworld.doislucas.services.PaisService;

import java.text.Normalizer;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class indexController {

    @Autowired
    private ContinenteService ccs;
    @Autowired
    private PaisService ps;

    @RequestMapping(value = "/paises", method = RequestMethod.GET)
    public List<Pais> PaisesParam(@RequestParam(value = "nome", required = true) String nome){ return ps.findOneName(removerAcentos(nome)); }

    @RequestMapping(value = "/continentes", method = RequestMethod.GET)
    public List<Continente> allContinentes(@RequestParam(value = "nome", required = false) String name) {
        if(name != null){
            return ccs.findByName(removerAcentos(name));
        }else{
            return ccs.findAll();
        }
    }

    @RequestMapping(value = "/continentes/{id}", method = RequestMethod.GET)
    public Continente ContinenteByID(@PathVariable("id") int id) { return ccs.findById(id); }

    @RequestMapping(value = "/continentes/{id}/paises", method = RequestMethod.GET)
    public List<Pais> PaisByContinente(@PathVariable("id") int id) {
        Continente escolhido = ccs.findById(id);
        return escolhido.getPaises();
    }

    @RequestMapping(value = "/continentes/{id}/paises/{id2}", method = RequestMethod.GET)
    public Pais PaisByID(@PathVariable("id") int id, @PathVariable("id2") int id2) { return ps.findOneIDs(id,id2); }

    public static String removerAcentos(String str) { return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""); }

}
