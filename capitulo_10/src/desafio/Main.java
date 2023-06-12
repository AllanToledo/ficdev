package desafio;

//@author Allan Toledo

import desafio.model.Escola;
import desafio.respository.EscolaRepository;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Escola> escolas = EscolaRepository.getInstance().getAll();
        for(Escola escola: escolas){
            System.out.println(escola);
        }
        String nome = JOptionPane.showInputDialog("Digite o nome da escola: ");
        Escola nova = new Escola(nome);
        System.out.println(nova);
        EscolaRepository.getInstance().save(nova);
        System.out.println(nova);
        
    }
}
