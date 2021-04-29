/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class Questao30 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A, B, C, D = 0;

        {
            System.out.println("Insira o primeiro número: ");
            A = ler.nextInt();
            System.out.println("Insira o segundo número: ");
            B = ler.nextInt();
            
            ler.close();
        }
        {
            C = A + B - A;
            D = A + B - C;
        }
        {
            System.out.println("O valor do primeiro número é: " + C);
            System.out.println("O valor do segundo número é: " + D);
        }
    }

}
