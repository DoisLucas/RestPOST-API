package tecworld.doislucas.models;

import javax.persistence.*;

@Entity
@Table(name = "tab_pais")
public class Pais {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String capital;
    private long area;
    private long populacao;
    private String governo;
    private String lema;
    private String hino;
    private String linguas;
    private String moeda;
    private String vizinhos;
    private String f_maritimas;

    @ManyToOne
    private Continente c;

    public Pais() {
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public String getGoverno() {
        return governo;
    }

    public void setGoverno(String governo) {
        this.governo = governo;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getHino() {
        return hino;
    }

    public void setHino(String hino) {
        this.hino = hino;
    }

    public String getLinguas() {
        return linguas;
    }

    public void setLinguas(String linguas) {
        this.linguas = linguas;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(String vizinhos) {
        this.vizinhos = vizinhos;
    }

    public String getF_maritimas() {
        return f_maritimas;
    }

    public void setF_maritimas(String f_maritimas) {
        this.f_maritimas = f_maritimas;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                ", populacao=" + populacao +
                ", governo='" + governo + '\'' +
                ", lema='" + lema + '\'' +
                ", hino='" + hino + '\'' +
                ", linguas='" + linguas + '\'' +
                ", moeda='" + moeda + '\'' +
                ", vizinhos='" + vizinhos + '\'' +
                ", f_maritimas='" + f_maritimas + '\'' +
                ", c=" + c +
                '}';
    }
}

