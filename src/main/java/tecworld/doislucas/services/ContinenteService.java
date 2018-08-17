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
    public Continente add(Continente p) { return this.cr.save(p); }
    public Continente findOne(int id) { return this.cr.findById(id).get(); }

}
