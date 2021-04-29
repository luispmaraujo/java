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
 * 11.	Elabore um programa que preencha uma matriz 6 X 3, calcule e mostre:
 *
 * A.	O maior elemento da matriz e sua respectiva posição, ou seja, linha e
 * coluna; B.	O menor elemento da matriz e sua respectiva posição, ou seja,
 * linha e coluna.
 *
 */
public class Questao11 {

    public static void main(String[] args) {

        int quantidadeLinha = 6;
        int quantidadeColuna = 3;
        int posicaoInicialLinha = 0;
        int posicaoInicialColuna = 0;
        int menorNumero = 0;
        int maiorNumero = 0;

        int[][] matriz = new int[quantidadeLinha][quantidadeColuna];

        Scanner sc = new Scanner(System.in);

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                System.out.println("Insira um número inteiro: ");
                matriz[posicaoInicialLinha][posicaoInicialColuna] = sc.nextInt();
                menorNumero = matriz[posicaoInicialLinha][posicaoInicialColuna];
                maiorNumero = matriz[posicaoInicialLinha][posicaoInicialColuna];
            }
        }

        System.out.println("");
        System.out.println("");

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                if (menorNumero > matriz[posicaoInicialLinha][posicaoInicialColuna]) {
                    menorNumero = matriz[posicaoInicialLinha][posicaoInicialColuna];
                    System.out.println();
                }
            }
        }

        System.out.println("O menor número é: " + menorNumero);
        System.out.println("Sua posição na matriz é na linha: " + matriz.length);
        System.out.println("Sua posição na matriz é na coluna: " + posicaoInicialColuna);

        System.out.println("");
        System.out.println("");

        for (posicaoInicialLinha = 0; posicaoInicialLinha < quantidadeLinha; posicaoInicialLinha++) {
            for (posicaoInicialColuna = 0; posicaoInicialColuna < quantidadeColuna; posicaoInicialColuna++) {
                if (maiorNumero < matriz[posicaoInicialLinha][posicaoInicialColuna]) {
                    maiorNumero = matriz[posicaoInicialLinha][posicaoInicialColuna];
                }
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("Sua posição na matriz é na linha: " + posicaoInicialLinha);
        System.out.println("Sua posição na matriz é na coluna: " + posicaoInicialColuna);
    }
}
