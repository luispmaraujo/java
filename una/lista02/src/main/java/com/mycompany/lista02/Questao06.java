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
 * 6.	Crie um programa que leia um número e mostre se ele é divisível por 3 e por 7.
 */
public class Questao06 {
    public static void main(String[] args) {
        
        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        sc.close();

        if (numero % 3 == 0 && numero % 7 ==0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 7!");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e por 7!");
        }
        
        
    }
    
}
