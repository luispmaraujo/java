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
public class Questao23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double b, h, a = 0.0;

        {
            System.out.println("Digite o valor da base do triângulo: ");
            b = ler.nextDouble();

            System.out.println("Digite o valor da altura do triângulo: ");
            h = ler.nextDouble();
            
            ler.close();
        }

        a = (b * h) / 2;

        System.out.println("A aréa do triângulo é: " + a);

    }

}
