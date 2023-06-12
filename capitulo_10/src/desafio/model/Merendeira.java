package desafio.model;

//@author Allan Toledo
public class Merendeira {
    private Integer id;
    private String nome;
    private Escola escola;

    public Merendeira(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
    }
    
    public Merendeira(String nome) {
        this.nome = nome;
    }
    
    public Merendeira(int id, String nome, Escola escola) {
        this.id = id;
        this.nome = nome;
        this.escola = escola;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
    public boolean isTrabalhando() {
        return escola != null;
    }
    
    
}
