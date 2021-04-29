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
 * 8.	Crie um programa que leia um número inteiro de 3 casas decimais e mostre
 * se o algarismo da casa das centenas é par ou ímpar. Seu programa deverá
 * impedir que o usuário digite números inteiros com mais ou menos de 3 dígitos.
 */
public class Questao08 {

    public static void main(String[] args) {

        int numero = 0;
        int algarismoCentena = 0;

        Scanner sc = new Scanner(System.in);

        while (numero < 100 || numero > 999) {
            System.out.println("Por favor, digite um número composto por apenas três dígitos");
            numero = sc.nextInt();
        }

        sc.close();

        algarismoCentena = numero % 10;

        if (numero % 2 == 0) {
            System.out.println("O algarismo da casa das centenas é par!");
        } else {
            System.out.println("O algarismo da casa das centenas é ímpar!");
        }
    }

}
