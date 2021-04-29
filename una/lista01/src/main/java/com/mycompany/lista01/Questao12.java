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
public class Questao12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N, d, q, r = 0;

        {
            System.out.println("Insira o primeiro número:");
            N = ler.nextInt();
            
            System.out.println("Insira o segundo número:");
            d = ler.nextInt();
            
            ler.close();
        }
        {
            q = N / d;
            r = N - (d * q);
        }
        {
            System.out.println("O dividendo da operação é: " + N);
            System.out.println("O divisor da operação é :" + d);
            System.out.println("O quociente da operação é: " + q);
            System.out.println("O resto da operação é: " + r);
        }

    }

}
