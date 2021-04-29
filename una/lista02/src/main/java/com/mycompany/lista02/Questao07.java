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
 * 7.	Crie um programa que verifique e mostre para o usuário se um número
 * digitado é par ou ímpar.
 */
public class Questao07 {

    public static void main(String[] args) {

        double numero = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextDouble();

        sc.close();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é ímpar!");
        }

    }

}
