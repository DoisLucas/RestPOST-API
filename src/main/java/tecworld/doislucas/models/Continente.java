package tecworld.doislucas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_continente")
public class Continente {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    @OneToMany(mappedBy = "c")
    @JsonIgnore
    private List<Pais> paises = new ArrayList<Pais>();

    public Continente() {
    }

    public Continente(String nome) {
        this.nome = nome;
        this.paises = paises;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", paises=" + paises +
                '}';
    }
}
