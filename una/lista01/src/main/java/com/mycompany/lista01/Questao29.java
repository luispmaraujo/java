/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class Questao29 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int centena, dezena, unidade, entrada, saida = 0;

        {
            System.out.println("Insira um número de três dígitos:");
            entrada = ler.nextInt();
            
            ler.close();
           
            centena = entrada / 100;
            dezena = ((entrada / 10) % 10);
            unidade = entrada % 10;
            saida = (unidade * 100) + (dezena * 10) + centena;

            System.out.println("O número invertido é: " + saida);

        }

    }

}
