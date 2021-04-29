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
 * 4.	Crie um programa que receba um número inteiro, verifique se ele é múltiplo
 * de 3 e imprima uma das mensagens: “é múltiplo de 3” ou “Não é múltiplo de 3”.
 */
public class Questao04 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        sc.close();

        if (numero % 3 == 0) {
            System.out.println("\"é múltiplo de 3\"");
        } else {
            System.out.println("\"Não é múltiplo de 3\"");
        }
    }

}
