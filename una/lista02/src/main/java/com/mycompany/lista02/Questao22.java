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
 * 22.	Faça um programa que leia um número não determinado de pares de valores
 * [m, n], todos inteiros e positivos, um par de cada vez, e que calcule e
 * mostre a soma de todos os números inteiros entre m e n (inclusive). A
 * digitação de pares terminará quando m for maior ou igual a n.
 */
public class Questao22 {

    public static void main(String[] args) {

        int numero1, numero2, soma = 0;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Informe o primeiro número: ");
            numero1 = sc.nextInt();

            System.out.println("Escreva o segundo número: ");
            numero2 = sc.nextInt();

            soma = numero1 + numero2;

            System.out.println("A soma é : " + soma);

        } while (numero1 < numero2);

        System.out.println("Programa finalizado");
    }

}
