package desafio.model;

//@author Allan Toledo
public class Escola {
    private Integer id;
    private String nome;

    public Escola(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Escola(String nome) {
        this.id = null;
        this.nome = nome;
    }
    
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    @Override
    public String toString() {
        return "Escola{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
    
}
