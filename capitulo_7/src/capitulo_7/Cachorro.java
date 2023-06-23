package capitulo_7;

//@author Allan Toledo
public class Cachorro extends Animal {

    int corPelo;
    
    public Cachorro(int pata, int altura){
        //super(pata, altura);
        this.pata = pata;
        this.altura = altura;
    }
    
    public Cachorro(int pata, int altura, int corPelo) {
        super(pata, altura);
        this.corPelo = corPelo;
    }

}
