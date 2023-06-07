package desafio.transporte.automovel;

//@author Allan Toledo


public class Moto extends Automovel {

    private int cilindradas;

    public Moto(int cilindradas, int potencia, int combustao, int lugares, int cargaMaxima) {
        super(potencia, combustao, lugares, cargaMaxima);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
}
