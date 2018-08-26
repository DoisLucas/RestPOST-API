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

    public List<Pais> findOneName(String nome){ return this.pr.findOneName(nome); }
    public Pais findOneIDs(int id, int id1) { return this.pr.findOneIDs(id, id1); }

}
