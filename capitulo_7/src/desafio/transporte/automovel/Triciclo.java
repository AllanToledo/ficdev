package desafio.transporte.automovel;

//@author Allan Toledo
public class Triciclo extends Moto {
    
    private boolean invertido;

    public Triciclo(boolean invertido, int cilindradas, int potencia, int combustao, int lugares, int cargaMaxima) {
        super(cilindradas, potencia, combustao, lugares, cargaMaxima);
        this.invertido = invertido;
    }

    public boolean isInvertido() {
        return invertido;
    }

    public void setInvertido(boolean invertido) {
        this.invertido = invertido;
    }
    
    

}
