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
 * 3. Faça um programa que preencha dois vetores de dez elementos numéricos cada
 * um e mostre o vetor resultante da intercalação deles.
 *
 * Vetor 1: [3, 5, 4, 2, 2, 5, 3, 2, 5, 9]; n = 10 Vetor 2: [7, 15, 20, 0, 18,
 * 4, 55, 23, 8, 6]; n = 10Intercalação: [3, 7, 5, 15, 4, 20, 2, 0, 2, 18, 5, 4,
 * 3, 55, 2, 23, 5, 8, 9, 6]; n = 20
 */
public class Questao03 {

    public static void main(String[] args) {

        int[] vetor1;
        int[] vetor2;
        int[] vetorIntercalacao;

        int posicaoVetor = 0;
        int posicaoInicial = 0;

        vetor1 = new int[10];
        vetor2 = new int[10];
        vetorIntercalacao = new int[20];

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < 10; posicaoVetor++) {
            System.out.println("Insira um número inteiro para preencher o primeiro vetor: ");
            vetor1[posicaoVetor] = sc.nextInt();
        }

        for (posicaoVetor = 0; posicaoVetor < 10; posicaoVetor++) {
            System.out.println("Insira um número inteiro para preencher o segundo vetor: ");
            vetor2[posicaoVetor] = sc.nextInt();
        }
        
        sc.close();

        for (posicaoVetor = 0; posicaoVetor < 10; posicaoVetor++) {
            vetorIntercalacao[posicaoInicial] = vetor1[posicaoVetor];
            posicaoInicial = posicaoInicial + 2;
        }

        posicaoInicial = 1;

        for (posicaoVetor = 0; posicaoVetor < 10; posicaoVetor++) {
            vetorIntercalacao[posicaoInicial] = vetor2[posicaoVetor];
            posicaoInicial = posicaoInicial + 2;
        }

        for (posicaoVetor = 0; posicaoVetor < 20; posicaoVetor++) {
            System.out.println("O resultado da intercalação dos vetores 1 e 2 é: " + vetorIntercalacao[posicaoVetor]);
        }
    }
}
