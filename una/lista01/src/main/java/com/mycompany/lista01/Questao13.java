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
public class Questao13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int w, x, y, z, soma = 0;

        {
            System.out.println("Insira o primeiro número");
            w = ler.nextInt();

            System.out.println("Insira o segundo número");
            x = ler.nextInt();

            System.out.println("Insira o terceiro número");
            y = ler.nextInt();

            System.out.println("Insira o quarto número");
            z = ler.nextInt();
            
            ler.close();
        }

        soma = w + x + y + z;

        System.out.println("A soma dos números digitados é: " + soma);

    }

}
