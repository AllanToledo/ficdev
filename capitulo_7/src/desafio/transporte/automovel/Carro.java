package desafio.transporte.automovel;

//@author Allan Toledo

import desafio.transporte.Automovel;

public class Carro extends Automovel {

    private int portas;

    public Carro(int portas, int potencia, int combustao, int lugares, int cargaMaxima) {
        super(potencia, combustao, lugares, cargaMaxima);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    
}
