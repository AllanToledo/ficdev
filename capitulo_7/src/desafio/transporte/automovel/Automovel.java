package desafio.transporte.automovel;

//@author Allan Toledo

import desafio.transporte.Transporte;

public class Automovel extends Transporte {

    private int potencia;
    private int combustao;

    public Automovel(int potencia, int combustao, int lugares, int cargaMaxima) {
        super(lugares, cargaMaxima);
        this.potencia = potencia;
        this.combustao = combustao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCombustao() {
        return combustao;
    }

    public void setCombustao(int combustao) {
        this.combustao = combustao;
    }
    
    
    
}
