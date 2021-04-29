/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 6.	Faça um programa que receba a temperatura média de cada mês do ano,
 * armazenando-as em um vetor. Calcule e mostre a maior e a menor temperatura do
 * ano e em que mês ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 –
 * fevereiro...).
 *
 * Desconsidere empates.
 */
public class Questao06 {

    public static void main(String[] args) {

        int quantidadePosicao = 12;
        int posicaoVetor = 0;

        double temperaduraMaxima = 0.0;
        double temperaduraMinima = 0.0;

        String mesMaisFrio = null;
        String mesMaisQuente = null;

        String[] nomeMes;
        double[] temperaturaMediaMensal;

        nomeMes = new String[quantidadePosicao];
        temperaturaMediaMensal = new double[quantidadePosicao];

        nomeMes[0] = "janeiro";
        nomeMes[1] = "fevereiro";
        nomeMes[2] = "março";
        nomeMes[3] = "abril";
        nomeMes[4] = "maio";
        nomeMes[5] = "junho";
        nomeMes[6] = "julho";
        nomeMes[7] = "agosto";
        nomeMes[8] = "setembro";
        nomeMes[9] = "outubro";
        nomeMes[10] = "novembro";
        nomeMes[11] = "dezembro";

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            System.out.println(nomeMes[posicaoVetor] + " ==> " + "Insira a temperatura média registrada nesse mês: ");
            temperaturaMediaMensal[posicaoVetor] = sc.nextDouble();
            temperaduraMinima = temperaturaMediaMensal[posicaoVetor];
            System.out.println(temperaduraMinima);
        }

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            if (temperaduraMinima > temperaturaMediaMensal[posicaoVetor]) {
                temperaduraMinima = temperaturaMediaMensal[posicaoVetor];
                mesMaisFrio = nomeMes[posicaoVetor];
            }
        }

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            if (temperaduraMaxima < temperaturaMediaMensal[posicaoVetor]) {
                temperaduraMaxima = temperaturaMediaMensal[posicaoVetor];
                mesMaisQuente = nomeMes[posicaoVetor];
            }
        }

        System.out.println("");
        System.out.println("");

        System.out.println("O mês mais frio foi: " + mesMaisFrio);
        System.out.println("A temperatura mínima registrada foi de: " + temperaduraMinima + " graus Celsius.");

        System.out.println("");

        System.out.println("O mês mais quente do ano foi: " + mesMaisQuente);
        System.out.println("A temperatura máxima registrada foi de: " + temperaduraMaxima + " graus Celsius.");

        sc.close();
    }
}
