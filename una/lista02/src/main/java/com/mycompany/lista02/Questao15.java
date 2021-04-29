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
 * 15.	Faça um programa que receba quatro notas de um aluno, calcule e mostre a
 * média aritmética das notas e a mensagem de aprovado ou reprovado,
 * considerando para aprovação média 7.
 */
public class Questao15 {

    public static void main(String[] args) {

        double nota1 = 0, nota2, nota3, nota4, mediaAritmetica = 0.0;
        double media = 7.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.println("Insira a quarta nota: ");
        nota4 = sc.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaAritmetica >= media) {
            System.out.println("A média para aprovação é: " + media);
            System.out.println("Sua média aritmética é: " + mediaAritmetica);
            System.out.println("Parabéns!");
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("A média para aprovação é: " + media);
            System.out.println("Sua média aritmética é: " + mediaAritmetica);
            System.out.println("Que pena!");
            System.out.println("Você foi reprovado!");
        }

    }

}
