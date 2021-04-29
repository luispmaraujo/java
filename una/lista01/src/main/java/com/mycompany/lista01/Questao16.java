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
public class Questao16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, ponderada;
        int peso1, peso2, peso3;

        {
            {
                System.out.println("Digite a primeira nota:");
                nota1 = ler.nextDouble();

                System.out.println("Digite o peso da nota:");
                peso1 = ler.nextInt();
                
                ler.close();
            }
            {
                System.out.println("Digite a segunda nota:");
                nota2 = ler.nextDouble();

                System.out.println("Digite o peso da nota:");
                peso2 = ler.nextInt();
            }
            {
                System.out.println("Digite a terceira nota:");
                nota3 = ler.nextDouble();

                System.out.println("Digite o peso da nota:");
                peso3 = ler.nextInt();
            }
        }

        ponderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das notas fornecidas é: " + ponderada);
    }

}
