package desafio1;

//@author Allan Toledo

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nutricionista")
public class Nutricionista {
    
    @Id
    private String nome;
    @Column(nullable=false, unique=true)
    private String crn;
    @Column(nullable=false, unique=false)
    private String uf;

    public Nutricionista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
}
