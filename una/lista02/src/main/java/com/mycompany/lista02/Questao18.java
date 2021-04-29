/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import javax.swing.JOptionPane;

/**
 *
 *
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 18.	Faça um programa que receba um número inteiro maior que 1, verifique e
 * mostre uma mensagem se o número fornecido é primo ou não. Um número é primo
 * quando é divisível apenas por 1 e por ele mesmo.
 */
public class Questao18 {

    public static void main(String[] args) {

        int n[] = new int[1];

        for (int i = 0; i < n.length; i++) {

            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número desejado: "));
        }

        for (int i = 0; i < n.length; i++) {

            if (ehPrimo(n[i])) {

                System.out.println("O número " + n[i] + " é primo!");
            }
        }
    }

    private static boolean ehPrimo(int numero) {

        for (int j = 2; j < numero; j++) {

            if (numero % j == 0) {

                return false;
            }
        }

        return true;
    }

}
