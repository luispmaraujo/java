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
public class Questao22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double deposito, taxaJuros, rendimento, valorTotal = 0.0;

        {
            System.out.println("Insira o valor do depósito: " + "R$ ");
            deposito = ler.nextDouble();

            System.out.println("Insira a taxa de juros: ");
            taxaJuros = ler.nextDouble();
            
            ler.close();
        }
        {
            rendimento = deposito * (taxaJuros / 100);
            valorTotal = deposito + rendimento;
        }
        {
            System.out.println("O valor do rendimento é de: " + "R$ " + rendimento);
            System.out.println("O valor total após o rendimento é de: " + "R$ " + valorTotal);
        }
    }
}
