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
 * 13.	Faça um programa para resolver equações do 2º grau.
 */
public class Questao13 {

    public static void main(String[] args) {

        double delta, a, b, c, x1, x2 = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de \"a\": ");
        a = sc.nextDouble();

        System.out.println("Insira o valor de \"b\": ");
        b = sc.nextDouble();

        System.out.println("Insira o valor de \"c\": ");
        c = sc.nextDouble();

        delta = (b * b) - ((4 * a) * c);
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("O valor de delta é: " + delta);
        System.out.println("O valor da primeira raiz é: " + x1);
        System.out.println("O valor da segunda raiz é: " + x2);
    }

}
