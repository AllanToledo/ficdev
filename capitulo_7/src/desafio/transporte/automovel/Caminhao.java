package desafio.transporte.automovel;

//@author Allan Toledo

import desafio.transporte.Automovel;

public class Caminhao extends Automovel {

    
    private int eixos;

    public Caminhao(int eixos, int potencia, int combustao, int lugares, int cargaMaxima) {
        super(potencia, combustao, lugares, cargaMaxima);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    
}
