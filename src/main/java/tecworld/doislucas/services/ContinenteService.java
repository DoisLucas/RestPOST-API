package tecworld.doislucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tecworld.doislucas.models.Continente;
import tecworld.doislucas.repositories.ContinenteRepository;

import java.util.List;

@Service
@Primary
public class ContinenteService {

    @Autowired
    private ContinenteRepository cr;

    public List<Continente> findAll() { return this.cr.findAll(); }
    public Continente findById(int id) { return this.cr.findById(id).orElse(null); }
    public List<Continente> findByName(String nome){ return this.cr.findByName(nome); }

}
