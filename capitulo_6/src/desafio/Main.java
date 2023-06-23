package desafio;

//@author Allan Toledo

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Main {
    public static void main(String[] args) {
        
        Set<Tarefa> tarefas = new TreeSet<>();
        
        JTextField titulo = new JTextField();
        JTextField descricao = new JTextField();
        Object[] corpo = {
            "Titulo:", titulo,
            "Descricao:", descricao
        };
        String prioridades[] = {"URGENTE", "IMPORTANTE", "NORMAL", "OPCIONAL", "CANCELAR"};
        String menu[] = {"ADICIONAR", "MOSTRAR TAREFAS", "SAIR"};
        
        while(true){
            
            int opcao = JOptionPane.showOptionDialog(
                    null, 
                    "Menu",
                    "Tarefa",
                    JOptionPane.WARNING_MESSAGE,
             0,
                   null, 
                menu,
                       menu[2]);
            if(opcao == 0){  
                int prioridade = JOptionPane.showOptionDialog(
                        null, 
                        corpo,
                        "Tarefa",
                        JOptionPane.WARNING_MESSAGE,
                 0,
                       null, 
                    prioridades,
                           prioridades[4]);


                if(prioridade > -1 && prioridade < 4){
                    Tarefa tarefa = new Tarefa(
                            titulo.getText(), 
                            descricao.getText(),
                                    Tarefa.Prioridades.values()[prioridade]);

                    if(tarefas.contains(tarefa)){
                        JOptionPane.showMessageDialog(null, "Existe uma tarefa pendende com esse titulo, marque como conluida ou altere o titulo.");
                    } else{
                        tarefas.add(tarefa);
                        titulo.setText("");
                        descricao.setText("");
                    }
                }
            }
            
            if(opcao == 1) {
                final AtomicReference<Object[]> message = new AtomicReference(new Object[tarefas.size() * 2]);
                final AtomicInteger indice = new AtomicInteger(0);
                tarefas.forEach((Tarefa value) -> {
                    message.get()[indice.getAndIncrement()] = value.toString();
                    JCheckBox button = new JCheckBox();
                    button.addActionListener((e) -> {
                        if(button.isSelected())
                            tarefas.remove(value);
                        else
                            tarefas.add(value);
                    });
                    message.get()[indice.getAndIncrement()] = button;
                });
                JOptionPane.showMessageDialog(null, message.get());
            }
            
            if(opcao == 2) break;
        }
        
        
    }
    
}
