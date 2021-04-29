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
 * 23.	Faça um programa que receba várias idades, calcule e mostre a média das
 * idades digitadas. Finalize o programa digitando uma idade igual a zero.
 */
public class Questao23 {

    public static void main(String[] args) {

        int idade, contador = 0;
        int soma = 0;
        Double mediaIdade;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Escreva sua idade : ");
            idade = sc.nextInt();

            if (idade > 0) {

                soma = soma + idade;
                contador = contador + 1;
            }

        } while (idade != 0);

        if (contador > 0) {

            mediaIdade = (double) (soma / contador);

            System.out.println("A média das idades é de: " + mediaIdade);
        }

    }

}
