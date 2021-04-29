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
 *16.	Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, 
 * utilizando as seguintes fórmulas (onde h é a altura):
 * A.	Homens: (72.7 * h) – 58.
 * B.	Mulheres: (62.1 * h) – 44.7.
 */
public class Questao16 {

    public static void main(String[] args) {

        double h, pesoIdeal = 0.0;

        String sexo = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura em metros: ");
        System.out.println("Exemplo: 1,80");
        h = sc.nextDouble();

        System.out.println("Qual o seu sexo? ");
        sexo = sc.next();
        
        sc.close();

        if (sexo != "masculino" && sexo != "Masculino" && sexo != "MASCULINO") {

            switch (sexo) {

                case "masculino":
                case "Masculino":
                case "MASCULINO":

                    pesoIdeal = (72.7 * h) - 58;

                    System.out.println("Seu peso ideal é: " + pesoIdeal + "KG.");

                    break;
            }

            if (sexo != "feminino" && sexo != "Feminino" && sexo != "FEMININO") {
                
                switch (sexo) {
                    case "feminino":
                    case "Feminino":
                    case "FEMININO":

                        pesoIdeal = (62.1 * h) - 44.7;

                        System.out.println("Seu peso ideal é: " + pesoIdeal + "KG.");

                        break;
                }
            }

        }
    }

}
