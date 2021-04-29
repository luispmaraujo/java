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
 * 2.	Construa um programa que faça a adição de dois número inteiros. Se o
 * resultado for maior do que 10 mostre o resultado da soma, caso contrário,
 * mostre a seguinte mensagem para o usuário: "Não é possível fazer a adição!"
 */
public class Questao02 {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = sc.nextInt();

        sc.close();

        numero1 += numero2;

        if (numero1 > 10) {
            System.out.println("A soma dos números informados é: " + numero1);
        } else {
            System.out.println("\"Não é possível fazer a adição!\"");
        }
    }

}
