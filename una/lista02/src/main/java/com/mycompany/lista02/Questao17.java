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
 * 17.	Um endocrinologista deseja controlar a saúde de seus pacientes e, para
 * isso, se utiliza do Índice de Massa Corporal (IMC). O IMC é determinado pela
 * divisão da massa do indivíduo pelo quadrado de sua altura, em que a massa
 * está em quilogramas e a altura em metros.
 *
 * Crie um programa que leia o peso e altura de um paciente, calcule o IMC,
 * mostre o resultado e a classificação segundo a tabela abaixo:
 */
public class Questao17 {

    public static void main(String[] args) {

        String nome = null;
        double massa, altura, imc = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do paciente: ");
        nome = sc.next();

        System.out.println("Informe a massa (em KG) do paciente: ");
        massa = sc.nextDouble();

        System.out.println("Informe a altura (em metrs) do paciente:");
        altura = sc.nextDouble();

        sc.close();

        imc = massa / (altura * altura);

        if (imc < 17) {
            System.out.println("O paciente está muito abaixo do peso ideal!");
        }

        if (imc > 17 && imc < 18.49) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está abaixo do peso ideal!");
        }

        if (imc > 18.50 && imc < 24.99) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está com o peso ideal!");
        }

        if (imc > 25 && imc < 29.99) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está com o peso acima do ideal!");
        }

        if (imc > 30 && imc < 34.99) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está com obesidade I!");
        }

        if (imc > 35 && imc < 39.99) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está com obesidade II!");
        }

        if (imc > 40) {
            System.out.println("Seu IMC é de: " + imc);
            System.out.println("O paciente está com obesidade III!");
        }
    }

}
