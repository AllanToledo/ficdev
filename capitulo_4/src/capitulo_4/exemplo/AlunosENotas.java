package capitulo_4.exemplo;

//@author Allan Toledo

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunosENotas {
    public static class Aluno {
        public String nome;
        public int idade;
        public float nota;

        public Aluno(String nome, int idade, float nota) {
            this.nome = nome;
            this.idade = idade;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "(" + nome + " " + idade + " anos nota: " + nota + ")";
        }  
        
    }
    
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList();
        
        while(true){
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um aluno? (s|n)");
            if(opcao != JOptionPane.YES_OPTION) break;
            String[] entrada = JOptionPane
                    .showInputDialog("Digite o nome, idade e nota, separadas por virgula.").split(",");
            
            alunos.add(new Aluno(entrada[0], 
                    Integer.parseInt(entrada[1].strip()), 
                    Float.parseFloat(entrada[2].strip()))
            );
        }
        
        float media = 0;
        for(Aluno aluno: alunos) media += aluno.nota / alunos.size();
        
        JOptionPane.showMessageDialog(null, String.format("Média das notas: %.2f", media));
        
        JOptionPane.showMessageDialog(null, alunos);
        
    }
}
