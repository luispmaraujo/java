/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 */
public class Questao28 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoNascimento, anoAtual, idadeAtual, idade2050 = 0;
        int ano2050 = 2050;

        {
            System.out.println("Insira o ano de nascimento: ");
            anoNascimento = ler.nextInt();

            System.out.println("Insira o ano atual: ");
            anoAtual = ler.nextInt();
            
            ler.close();
        }
        {
            idadeAtual = anoAtual - anoNascimento;
            idade2050 = (ano2050 - anoAtual) + idadeAtual;
        }
        {
            System.out.println("Sua idade atual é: " + idadeAtual + " anos");
            System.out.println("Sua idade no ano de 2050 será: " + idade2050 + " anos");
        }

    }

}
