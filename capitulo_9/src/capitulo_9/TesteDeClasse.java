package capitulo_9;

//@author Allan Toledo
public class TesteDeClasse {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        int resultado = obj.metodo();
        assert(resultado == 10);
    }
}
