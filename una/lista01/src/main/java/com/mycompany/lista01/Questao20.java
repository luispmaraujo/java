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
public class Questao20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioBruto, salarioLiquido, gratificacao, tributacao = 0.0;

        {
            System.out.println("Insira o Salário Bruto: " + "R$ ");
            salarioBruto = ler.nextDouble();
            
            ler.close();
        }
        {
            gratificacao = (salarioBruto * 0.05) / 1.0;
            tributacao = ((salarioBruto + gratificacao) * 0.07) / 1.0;
            salarioLiquido = (salarioBruto + gratificacao) - tributacao;
        }

        System.out.println("O salário liquido é: " + "R$ " + salarioLiquido);

    }

}
