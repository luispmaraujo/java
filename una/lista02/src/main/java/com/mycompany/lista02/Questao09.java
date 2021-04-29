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
 * 9.	Construa um programa que indique se o número digitado está compreendido
 * entre 20 e 90 exclusive ou não.
 */
public class Questao09 {

    public static void main(String[] args) {

        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite um número entre 20 e 90: ");
        numero = sc.nextInt();

        sc.close();

        if (numero > 20 && numero < 90) {
            System.out.println("O número " + numero + " está compreendido entre os números 20 e 90!");
        } else {
            System.out.println("O número " + numero + " não está compreendido entre os números 20 e 90!");
        }

    }

}
