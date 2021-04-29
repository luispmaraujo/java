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
 * 20.	Faça um programa que calcule e mostre a tabuada de um número digitado
 * pelo usuário. Por exemplo: “Digite um número: 5”
 */
public class Questao20 {

    public static void main(String[] args) {

        int tabuada = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber a sua tabuada: ");
        tabuada = sc.nextInt();

        sc.close();

        for (int i = 1; i <= 10; i++) {

            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

        }
    }

}
