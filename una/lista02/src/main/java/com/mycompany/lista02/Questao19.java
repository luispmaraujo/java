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
 * 19.	Na matemática, a Sucessão de Fibonacci ou Sequência de Fibonacci, é uma
 * sequência de números inteiros, começando normalmente por 0 e 1, na qual, cada
 * termo subsequente corresponde à soma dos dois anteriores. Por exemplo: 0, 1,
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ...;
 * escreva um programa que leia um número inteiro do usuário (n) e imprima os n
 * primeiros termos da sequência de Fibonacci.
 */
public class Questao19 {

    public static void main(String[] args) {

        int numero = 0, marcador1 = 1, marcador2 = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade desejada: ");
        numero = sc.nextInt();

        System.out.println(marcador1);
        System.out.println(marcador2);
        
        sc.close();

        for (int i = 0; i < numero; i++) {

            marcador1 = marcador1 + marcador2;
            marcador2 = marcador1 - marcador2;

            System.out.println("0" + marcador1);

        }
    }

}
