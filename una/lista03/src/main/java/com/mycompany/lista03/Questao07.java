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
 * 7.	Faça um programa que preencha um vetor com dez números inteiros aleatórios
 * de 0 até 10 inclusive, calcule e mostre os números superiores a 5 e suas
 * respectivas posições. O programa deverá mostrar mensagem se não existir
 * nenhum número nessa condição.
 */
public class Questao07 {

    public static void main(String[] args) {

        int quantidadePosicao = 10;
        int vetorPosicao = 0;

        int[] vetor;

        vetor = new int[quantidadePosicao];

        Random gerador = new Random();

        for (vetorPosicao = 0; vetorPosicao < quantidadePosicao; vetorPosicao++) {
            vetor[vetorPosicao] = gerador.nextInt(11);
            System.out.println(vetor[vetorPosicao]);
        }

        for (vetorPosicao = 0; vetorPosicao < quantidadePosicao; vetorPosicao++) {
            if (vetor[vetorPosicao] > 5) {
                System.out.println("O número gerado é: " + vetor[vetorPosicao] + ". Sua posição no vetor é: " + vetorPosicao + ".");
            }
        }

        if (vetor[0] <= 5 && vetor[1] <= 5 && vetor[2] <= 5 && vetor[3] <= 5 && vetor[4] <= 5 && vetor[5] <= 5 && vetor[6] <= 5 && vetor[7] <= 5 && vetor[8] <= 5 && vetor[9] <= 5) {
            System.out.println("Nenhum número gerado é maior do que 5.");

        }

    }

}
