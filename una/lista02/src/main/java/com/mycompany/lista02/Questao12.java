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
 * 12.	Crie um programa que leia três números inteiros e imprima o maior número dentre os três.
 */
public class Questao12 {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int swap = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número:   \n");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número:    \n");
        numero2 = sc.nextInt();

        System.out.print("Digite o terceiro número:   \n");
        numero3 = sc.nextInt();

        sc.close();

        if (numero1 > numero2) {
            swap = numero1;
        }

        if (numero2 > numero3) {
            swap = numero2;
        }

        if (numero3 > numero1) {
            swap = numero3;
        }

        System.out.println("O maior número dentre as três opções informadas é: " + swap);
    }

}
