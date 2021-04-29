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
 * 1.	Crie um programa que receba um número inteiro e mostre na tela caso ele seja maior do que 20.
 */
public class Questao01 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        sc.close();

        if (numero > 20) {
            System.out.println("O número " + numero + " é maior do que 20.");
        }
    }

}
