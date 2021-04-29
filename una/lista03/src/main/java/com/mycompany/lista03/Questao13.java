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
 * 13.	Elabore um programa que preencha uma matriz 12 4 com os valores das
 * vendas de uma loja, em que cada linha representa um mês do ano e cada coluna
 * representa uma semana do mês. O programa deverá calcular e mostrar:
 *
 * A.	O total vendido em cada mês do ano, mostrando o nome do mês por extenso;
 * B.	O total vendido em cada semana durante todo o ano; C.	O total vendido pela
 * loja no ano.
 *
 */
public class Questao13 {

    public static void main(String[] args) {

        double totalSemana = 0;
        double totalMes = 0;
        double totalAno = 0;

        int quantidadeMes = 12;
        int quantidadeSemana = 4;

        String[] nomeMes = new String[quantidadeMes];

        nomeMes[0] = "janeiro";
        nomeMes[1] = "fevereiro";
        nomeMes[2] = "março";
        nomeMes[3] = "abril";
        nomeMes[4] = "maio";
        nomeMes[5] = "junho";
        nomeMes[6] = "julho";
        nomeMes[7] = "agosto";
        nomeMes[8] = "setembro";
        nomeMes[9] = "outubro";
        nomeMes[10] = "novembro";
        nomeMes[11] = "dezembro";

        Random gerador = new Random();

        double matrizVenda[][] = new double[quantidadeMes][quantidadeSemana];

        for (int i = 0; i < quantidadeMes; i++) {
            for (int j = 0; j < quantidadeSemana; j++) {
                matrizVenda[i][j] = gerador.nextDouble() * 1000;
            }
        }

        for (int i = 0; i < quantidadeMes; i++) {
            for (int j = 0; j < quantidadeSemana; j++) {
                totalMes += matrizVenda[i][j];
            }

            System.out.println(nomeMes[i] + " - " + totalMes);
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < quantidadeSemana; i++) {
            for (int j = 0; j < quantidadeMes; j++) {
                totalSemana += matrizVenda[j][i];
            }

            System.out.println(" O total da semana " + (i + 1) + " é: " + totalSemana);
        }
    }
}