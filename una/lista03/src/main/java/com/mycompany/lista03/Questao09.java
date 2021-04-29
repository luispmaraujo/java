/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Random;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 9.	Faça um programa que preencha uma matriz 3 X 5 com números inteiros
 * aleatórios [0 - 9], calcule e mostre a quantidade de elementos entre 3 e 7.
 */
public class Questao09 {

    public static void main(String[] args) {

        int quantidadeIntervalo = 0;
        int quantidadeLinha = 3;
        int quantidadeColuna = 5;
        int quantidadeAleatorio = 10;
        int posicaoInicialLinha = 0;
        int posicaoInicialColuna = 0;

        int[][] matriz = new int[quantidadeLinha][quantidadeColuna];

        Random aleatorio = new Random(quantidadeAleatorio);

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                matriz[posicaoInicialLinha][posicaoInicialColuna] = aleatorio.nextInt(10);
                System.out.println(matriz[posicaoInicialLinha][posicaoInicialColuna]);
            }
        }

        System.out.println("");
        System.out.println("");

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                if (matriz[posicaoInicialLinha][posicaoInicialColuna] > 3 && matriz[posicaoInicialLinha][posicaoInicialColuna] < 7) {
                    quantidadeIntervalo++;
                    System.out.println("Os números entre 3 e 7 gerados aleatóriamente são: " + matriz[posicaoInicialLinha][posicaoInicialColuna]);
                }
            }
        }

        System.out.println("");
        System.out.println("");

        System.out.println("A quantidade total de números gerados aleatóriamente nesse intervalo é de: " + quantidadeIntervalo);
    }
}
