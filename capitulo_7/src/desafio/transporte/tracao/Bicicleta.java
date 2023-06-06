package desafio.transporte.tracao;

//@author Allan Toledo

import desafio.transporte.Transporte;

public class Bicicleta extends Transporte {
    private static enum TipoSuspensao {
        SEM, DIANTEIRA, TRASEIRA, FULL
    }
    
    private TipoSuspensao tipo;
    private float diametroRoda;

    public Bicicleta(TipoSuspensao tipo, float diametroRoda, int lugares, int cargaMaxima) {
        super(lugares, cargaMaxima);
        this.tipo = tipo;
        this.diametroRoda = diametroRoda;
    }

    public TipoSuspensao getTipo() {
        return tipo;
    }

    public void setTipo(TipoSuspensao tipo) {
        this.tipo = tipo;
    }

    public float getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(float diametroRoda) {
        this.diametroRoda = diametroRoda;
    }
    
    
    
    

}
