/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo_2;


import java.util.Scanner;
/**
 *
 * @author ficdev
 */
public class Capitulo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um inteiro menor que 2^32-1 ;)");
        int valor = (sc.nextInt() - 1) * 2;
        System.out.printf("%d é um excelente número. \n", valor);
        
    }
    
}
