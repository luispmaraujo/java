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
public class Questao26 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int b, a, x = 0;

        {
            System.out.println("Insira a base da potênciação: ");
            a = ler.nextInt();

            System.out.println("Insira o expoente da potenciação: ");
            x = ler.nextInt();
            
            ler.close();
        }

        b = (int) Math.pow(a, x);

        System.out.println("A potência é: " + b);
    }

}

}
