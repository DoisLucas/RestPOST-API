package tecworld.doislucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tecworld.doislucas.models.Pais;
import tecworld.doislucas.repositories.PaisRepository;

import java.util.List;

@Service
@Primary
public class PaisService {

    @Autowired
    private PaisRepository pr;

    public List<Pais> findAll(){ return this.pr.findAll(); }
    public Pais add(Pais p){ return this.pr.save(p); }
    public Pais finOne(int id) { return this.pr.findById(id).get(); }

}
