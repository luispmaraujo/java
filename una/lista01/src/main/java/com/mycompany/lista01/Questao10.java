/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 */
public class Questao10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, produto = 0;

        {
            System.out.println("Digite o primeiro número:");
            num1 = ler.nextInt();
            System.out.println("Digite o segundo número:");
            num2 = ler.nextInt();
            
            ler.close();
        }

        produto = num1 * num2;

        System.out.println("O produto da multiplicação dos números informados é: " + produto);

    }

}
