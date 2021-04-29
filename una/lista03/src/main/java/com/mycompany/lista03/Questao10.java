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
 * 10.	Crie um programa que preencha uma matriz 2 X 4 com números inteiros,
 * calcule e mostre:
 *
 * A.	A quantidade de elementos ímpares em cada linha;
 *
 * B.	A média dos elementos pares da matriz.
 *
 */
public class Questao10 {

    public static void main(String[] args) {

        int quantidadeImpares1 = 0;
        int quantidadeImpares2 = 0;
        int quantidadeLinha = 2;
        int quantidadeColuna = 4;
        int posicaoInicialLinha = 0;
        int posicaoInicialColuna = 0;

        int[][] matriz = new int[quantidadeLinha][quantidadeColuna];

        Scanner sc = new Scanner(System.in);

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                System.out.println("Insira um número inteiro: ");
                matriz[posicaoInicialLinha][posicaoInicialColuna] = sc.nextInt();
            }
        }

        System.out.println("");
        System.out.println("");

        for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
            for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
                if (matriz[posicaoInicialLinha][posicaoInicialColuna] % 2 != 0) {
                    if (posicaoInicialLinha == 0) {
                        quantidadeImpares1++;
                    }

                    if (posicaoInicialLinha == 1) {
                        quantidadeImpares2++;
                    }
                }
            }
        }

        System.out.println("A quantidade de números ímpares informados na linha 1: " + quantidadeImpares1);
        System.out.println("A quantidade de números ímpares informados na linha 2: " + quantidadeImpares2);

        sc.close();
    }
}
