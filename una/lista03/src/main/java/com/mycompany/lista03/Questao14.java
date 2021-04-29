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
 * 14.	Elabore um programa que preencha uma matriz M de ordem 4 X 6 e uma
 * segunda matriz N de ordem 6 X 4 com números aleatórios [0 - 9], calcule e
 * imprima a soma das linhas de M com as colunas de N.
 */
public class Questao14 {

    public static void main(String[] args) {

        int quantidadeIntervalo = 0;
        int quantidadeAleatorio = 10;
        int posicaoInicialLinha = 0;
        int posicaoInicialColuna = 0;

        int[][] matriz1 = new int[4][6];
        int[][] matriz2 = new int[6][4];

        Random aleatorio = new Random(quantidadeAleatorio);

        for (posicaoInicialLinha = 0; posicaoInicialLinha < 4; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < 6; posicaoInicialColuna++) {
                matriz1[posicaoInicialLinha][posicaoInicialColuna] = aleatorio.nextInt(10);
                System.out.println(matriz1[posicaoInicialLinha][posicaoInicialColuna]);
            }
        }

        for (posicaoInicialLinha = 0; posicaoInicialLinha < 6; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < 4; posicaoInicialColuna++) {
                matriz2[posicaoInicialLinha][posicaoInicialColuna] = aleatorio.nextInt(10);
                System.out.println(matriz2[posicaoInicialLinha][posicaoInicialColuna]);
            }
        }

    }

}
