/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuPrograma;

import geometria.Retangulo;

/**
 *
 * @author ficdev
 */
public class Main {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(20, 3);
        System.out.printf("Base: %.2f\n", ret.getBase());
        System.out.printf("Altura: %.2f\n", ret.getAltura());
        System.out.printf("Area: %.2f\n", ret.calcularArea());
        System.out.printf("Perimetro: %.2f\n", ret.calcularPerimetro());
    }
}
