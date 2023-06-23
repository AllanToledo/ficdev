package desafio.transporte;

//@author Allan Toledo
public class Transporte {

    private int lugares;
    private int cargaMaxima;
    private int cargaAtual;
    private int lugaresOcupado;
    

    public Transporte(int lugares, int cargaMaxima) {
        this.lugares = lugares;
        this.cargaMaxima = cargaMaxima;
        this.cargaAtual = 0;
        this.lugaresOcupado = 0;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    public void carregarCarga(int quantidade) {
        if(quantidade < 0 || quantidade + cargaAtual > cargaMaxima) throw new IllegalArgumentException();
        cargaAtual += quantidade;
    }
    
    public void descarregarCarga(int quantidade) {
        if(quantidade < 0 || cargaAtual - quantidade < 0) throw new IllegalArgumentException();
        cargaAtual -= quantidade;
    }
    
    public void embarcarPassageiro() {
        if(lugaresOcupado == lugares) throw new IllegalCallerException();
        lugaresOcupado++;
    }
    
    public void desembarcarPassageiro() {
        if(lugaresOcupado == 0) throw new IllegalCallerException();
        lugaresOcupado--;
    }
    
}
