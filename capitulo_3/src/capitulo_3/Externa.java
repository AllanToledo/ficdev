/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_3;

/**
 *
 * @author ficdev
 */
public class Externa {
    final private class Interna {
        public void imprimirUmaFraseAi(){
            System.out.println("Me llamo Interna");
        }
    }
    
    public static void main(String[] args) {
        Interna in = new Externa() . new Interna();
        in.imprimirUmaFraseAi();
    }
}
