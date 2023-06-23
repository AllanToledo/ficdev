package desafio.main;

//@author Allan Toledo

import desafio.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> cadastro = new ArrayList();
        cadastro.add(new Pessoa("Allan Toledo", 20));
        cadastro.add(new Pessoa("Carlos Rafael", 20));
        
        for(Pessoa pessoa: cadastro){
            System.out.println(pessoa.toString());
        }
    }
}
