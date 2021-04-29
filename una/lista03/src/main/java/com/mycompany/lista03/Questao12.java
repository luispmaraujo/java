/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Random;

/**
 *
 * @author Luís PAulo Maia de Araújo
 *
 * 12.	Faça um programa que preencha uma matriz 10 X 5 com números inteiros
 * aleatórios [0 - 9], e some cada uma das colunas, armazenando o resultado da
 * soma em um vetor. A seguir, o programa deverá atualizar cada elemento da
 * matriz com a multiplicação deles pelo resultado da soma dos elementos do
 * vetor e mostrar a matriz atualizada.
 */
public class Questao12 {

    public static void main(String[] args) {

        int quantidadeIntervalo = 0;
        int quantidadeLinha = 10;
        int quantidadeColuna = 5;
        int quantidadeAleatorio = 10;
        int posicaoInicialLinha = 0;
        int posicaoInicialColuna = 0;

        int[][] matriz = new int[quantidadeLinha][quantidadeColuna];
        int[] vetor = new int[5];

        Random aleatorio = new Random(quantidadeAleatorio);

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                matriz[posicaoInicialLinha][posicaoInicialColuna] = aleatorio.nextInt(10);
                System.out.println(matriz[posicaoInicialLinha][posicaoInicialColuna]);
            }
        }
    }
}
