package tecworld.doislucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tecworld.doislucas.models.Pais;
import tecworld.doislucas.repositories.PaisRepository;

import java.util.List;

import static tecworld.doislucas.utils.Functions.removerAcentos;

@Service
@Primary
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findOneName(String nome) {
        List<Pais> paises = this.paisRepository.findOneName(nome);

        for (Pais p : paises) {
            p.setBandeira_url(getBandeira(p.getNome()));
        }

        return this.paisRepository.findOneName(nome);
    }

    public Pais findOneIDs(int id, int id1) {
        Pais pais = this.paisRepository.findOneIDs(id, id1);
        pais.setBandeira_url(getBandeira(pais.getNome()));
        return this.paisRepository.findOneIDs(id, id1);
    }

    public String getBandeira(String nome_pais) {
        return "https://aimore.net/band/" + this.formatarNome(nome_pais) + ".jpg";
    }

    public String formatarNome(String nome_pais) {
        return removerAcentos(nome_pais.replaceAll(" ", "_"));
    }

}
