package desafio.transporte.tracao;

//@author Allan Toledo

import desafio.transporte.Transporte;

public class Carroca extends Transporte {
    
   private String animalDeTracao;

    public Carroca(String animalDeTracao, int lugares, int cargaMaxima) {
        super(lugares, cargaMaxima);
        this.animalDeTracao = animalDeTracao;
    }

    public String getAnimalDeTracao() {
        return animalDeTracao;
    }

    public void setAnimalDeTracao(String animalDeTracao) {
        this.animalDeTracao = animalDeTracao;
    }
   
   
}
