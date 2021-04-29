/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 21.	Faça um programa que leia um conjunto não determinado de valores e mostre
 * o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize o programa
 * com um valor negativo ou zero.
 */
public class Questao21 {

    public static void main(String[] args) {

        double numero, quadrado, cubo, raizQuadrada = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insisra um número: ");
        numero = sc.nextDouble();

        sc.close();

        quadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        raizQuadrada = Math.sqrt(numero);

        if (numero > 0) {

            System.out.println("O número informado é: " + numero);
            System.out.println("O quadrado do número informado é: " + quadrado);
            System.out.println("O cubo do número informado é: " + cubo);
            System.out.println("A raiz quadrada do número informado é: " + raizQuadrada);

        } else {
            System.out.println(0);
        }
    }

}
