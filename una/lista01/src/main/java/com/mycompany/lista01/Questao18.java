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
public class Questao18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioInicial, aumento, salarioFinal = 0.0;

        {
            System.out.println("Digite o valor do seu salário:");
            salarioInicial = ler.nextDouble();
            
            ler.close();
        }
        {
            aumento = (salarioInicial * 0.25) / 1.0;
            salarioFinal = salarioInicial + aumento;
        }

        System.out.println("O salário informado com 25% de aumento é: " + "R$" + " " + salarioFinal);

    }

}
