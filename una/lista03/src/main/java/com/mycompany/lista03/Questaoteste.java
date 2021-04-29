/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Random;

/**
 *
 * @author luisp
 */
public class Questaoteste {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] gabarito = new int[8];

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = (Math.abs(rnd.nextInt()) % 2);
        }

        int[][] alunos = new int[10][2];

        System.out.println("Aluno\t\tNota");
        for (int i = 0; i < 10; i++) {
            //Martricula
            alunos[i][0] = Math.abs(rnd.nextInt());
            alunos[i][1] = 0;

            for (int j = 0; j < gabarito.length; j++) {
                int resposta = Math.abs(rnd.nextInt()) % 2;
                if (resposta == gabarito[j]) {
                    alunos[i][1]++;
                }
            }
            System.out.println(alunos[i][0] + "\t\t" + alunos[i][1]);
        }

        int aprovados = 0;
        for (int i = 0; i < 10; i++) {
            if (alunos[i][1] >= 6) {
                aprovados++;
            }
        }
        System.out.println("Media de aprovados: " + (aprovados / 10.0) * 100);

    }

}
