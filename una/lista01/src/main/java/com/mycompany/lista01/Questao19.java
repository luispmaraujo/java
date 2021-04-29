/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.text.ChoiceFormat;
import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 */
public class Questao19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioInicial, porcentagemAumento, aumento, salarioFinal = 0.0;

        {
            System.out.println("Digite o valor do salário:");
            salarioInicial = ler.nextDouble();

            System.out.println("Informame a porcentagem de aumento:");
            porcentagemAumento = ler.nextDouble();
            
            ler.close();
        }
        {
            aumento = (salarioInicial * porcentagemAumento) / 100;
            salarioFinal = salarioInicial + aumento;
        }
        {
            System.out.println("O salário informado recebeu um acréscimo de: " + "R$ " + aumento);
            System.out.println("O salário atualizado é: " + "R$ " + salarioFinal);
        }
    }

}
