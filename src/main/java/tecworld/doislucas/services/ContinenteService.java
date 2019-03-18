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
    private ContinenteRepository continenteRepository;

    public List<Continente> findAll() { return this.continenteRepository.findAll(); }
    public Continente findById(int id) { return this.continenteRepository.findById(id).orElse(null); }
    public List<Continente> findByName(String nome){ return this.continenteRepository.findByName(nome); }

}
