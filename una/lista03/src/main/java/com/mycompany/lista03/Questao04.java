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
 * 4. Faça um programa que preencha um vetor com 8 números inteiros, calcule e
 * mostre 2 vetores resultantes. O primeiro vetor resultante deve conter os
 * números positivos e o segundo, os números negativos. Cada vetor resultante
 * vai ter, no máximo, oito posições, que não poderão ser completamente
 * utilizadas.
 *
 */
public class Questao04 {

    public static void main(String[] args) {

        int posicaoVetor = 0;
        int quantidadePosicao = 8;
        int numero = 0;

        int[] vetorInicial;
        int[] vetorPositivo;
        int[] vetorNegativo;

        vetorInicial = new int[quantidadePosicao];
        vetorPositivo = new int[quantidadePosicao];
        vetorNegativo = new int[quantidadePosicao];

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicao; posicaoVetor++) {
            System.out.println("Digite um número inteiro: ");
            vetorInicial[posicaoVetor] = sc.nextInt();

            numero = vetorInicial[posicaoVetor];
            
            if (numero == 0) {
                System.out.println("O número 0 é neutro.");
                
            }

            if (numero > 0) {
                vetorPositivo[posicaoVetor] = vetorInicial[posicaoVetor];
                System.out.println("O número " + numero +  " foi armazenado no vetor positivo.");
            }

            if (numero < 0) {
                vetorNegativo[posicaoVetor] = vetorInicial[posicaoVetor];
                System.out.println("O número " + numero +  " foi armazenado no vetor negativo.");
            }
        }

        sc.close();
    }
}
