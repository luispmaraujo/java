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
 * Faça um programa que leia 6 números inteiros e mostre:
 *
 * Os números pares digitados; A soma dos números pares digitados; Os números
 * ímpares digitados; A quantidade de números ímpares digitados. Vetor: [2, 4,
 * 5, 6, 3, 7]
 *
 * RELATÓRIO Os números pares são:
 *
 * número 2 na posição 1 número 4 na posição 2 número 6 na posição 4 Soma dos
 * pares = 12
 *
 * Os números ímpares são: número 5 na posição 3 número 3 na posição 5 número 7
 * na posição 6 Quantidade de ímpares = 3
 *
 */
public class Questao08 {

    public static void main(String[] args) {

        int posicaoVetor = 0;
        int quantidadePosicao = 6;
        int somaPar = 0;
        int quantidadeImpar = 0;

        int[] vetorInicial;
        int[] vetorImpar;

        vetorInicial = new int[quantidadePosicao];
        vetorImpar = new int[quantidadePosicao];

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            System.out.println("Digite um número inteiro: ");
            vetorInicial[posicaoVetor] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Os números pares são: ");

        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            if (vetorInicial[posicaoVetor] % 2 == 0) {
                System.out.println("O número " + vetorInicial[posicaoVetor] + " na posição " + posicaoVetor + " do vetor.");

                somaPar += vetorInicial[posicaoVetor];

            }
        }

        System.out.println("A soma dos números pares é: " + somaPar);

        System.out.println("");
        System.out.println("");

        System.out.println("Os números ímpares são: ");

        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            if (vetorInicial[posicaoVetor] % 2 != 0) {
                System.out.println("O número " + vetorInicial[posicaoVetor] + " na posição " + posicaoVetor + " do vetor.");

                vetorImpar[posicaoVetor] = vetorInicial[posicaoVetor];

                quantidadeImpar++;
            }
        }

        System.out.println("Quantidade de números ímpares é: " + quantidadeImpar);
        
        sc.close();
    }
}
