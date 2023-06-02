/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ficdev
 */
public class Capitulo_5 {

    private static class Motor {
        private int rotacao = 0;
        private boolean ligado = false;
        
        public void ligar() {
            if(ligado) return;
            ligado = true;
            rotacao = 100;
        }
        
        public void desligar() {
            ligado = false;
            rotacao = 0;
        }
        
        public int getRotacao(){
            return rotacao;
        }
        
        public void acelerar(){
            if(ligado) rotacao += 50;
        }
        
        public void desacelerar() {
            if(rotacao > 100) rotacao -= 50;
        }
        
        public boolean getLigado(){
            return ligado;
        }
    
    }
        
    public static void main(String[] args) {
        Motor motor = new Motor();
        while(true){
            String[] buttons = { "Ligar", "Desligar", "Acelerar", "Desacelerar" };

            int rc = JOptionPane.showOptionDialog(null,
                String.format("Estado: %s\nRPM: %d\n", 
                                motor.getLigado()? "Ligado": "Desligado", 
                                motor.getRotacao()),
                  "Motor",
              JOptionPane.WARNING_MESSAGE,
             0,
                   null, 
                buttons,
                       buttons[2]);

            if(rc == -1) break;
            switch(rc){
                case 0 -> motor.ligar();
                case 1 -> motor.desligar();
                case 2 -> motor.acelerar();
                case 3 -> motor.desacelerar();
            }
        }
    }
    
}
