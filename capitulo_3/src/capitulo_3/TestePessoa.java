/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_3;

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Allan Vitor Walecheski Toledo", 20);
        
        System.out.printf("Nome: %s.\n", eu.getNome());
        System.out.printf("Idade: %d anos.\n", 
                eu.getNome()
                        .replaceAll(" ", "")
                        .length());
    }
}
