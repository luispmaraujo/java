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
 * Faça um programa para corrigir provas de múltipla escolha. Cada prova tem
 * oito questões e cada questão vale um ponto. O primeiro conjunto de dados a
 * ser lido do usuário é o gabarito da prova. Os outros dados são os números dos
 * alunos e as respostas que deram às questões. Existem dez alunos matriculados.
 *
 * Calcule e mostre:
 *
 * O número e a nota de cada aluno; A porcentagem de aprovação, sabendo-se que a
 * nota mínima é 6
 */
public class Questao05 {

    public static void main(String[] args) {

        int posicaoVetor = 0;
        int quantidadeQuestoes = 8;
        int quantidadeAlunos = 10;
        double mediaAprovacao = 6.0;

        String[] questao;
        String[] gabaritoProfessor;
        String[] gabaritoAluno;
        int[] registroAluno;

        questao = new String[quantidadeQuestoes];

        questao[0] = "Questão 1 - Resposta: ";
        questao[1] = "Questão 2 - Resposta: ";
        questao[2] = "Questão 3 - Resposta: ";
        questao[3] = "Questão 4 - Resposta: ";
        questao[4] = "Questão 5 - Resposta: ";
        questao[5] = "Questão 6 - Resposta: ";
        questao[6] = "Questão 7 - Resposta: ";
        questao[7] = "Questão 8 - Resposta: ";

        gabaritoProfessor = new String[quantidadeQuestoes];
        gabaritoAluno = new String[quantidadeQuestoes];
        registroAluno = new int[quantidadeAlunos];

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < quantidadeQuestoes; posicaoVetor++) {
            System.out.println("Insira o gabarito da " + questao[posicaoVetor]);
            gabaritoProfessor[posicaoVetor] = sc.next();

        }

        System.out.println("");
        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadeQuestoes; posicaoVetor++) {
            System.out.println(questao[posicaoVetor] + gabaritoProfessor[posicaoVetor]);
        }

        System.out.println("");
        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadeAlunos; posicaoVetor++) {
            System.out.println("Insira o registro do aluno: ");
            registroAluno[posicaoVetor] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadeAlunos; posicaoVetor++) {
            System.out.println("O registro do aluno é: " + registroAluno[posicaoVetor]);
        }

        System.out.println("");
        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadeQuestoes; posicaoVetor++) {
            System.out.println("Insira o gabarito da " + questao[posicaoVetor]);
            gabaritoAluno[posicaoVetor] = sc.next();
        }

        System.out.println("");
        System.out.println("");

        for (posicaoVetor = 0; posicaoVetor < quantidadeQuestoes; posicaoVetor++) {
            System.out.println(gabaritoAluno[posicaoVetor]);
        }
        
        System.out.println("");
        System.out.println("");

        sc.close();

    }

}
