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
public class Questao21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioBruto, salarioLiquido, tributacao = 0.0;

        double gratificao = 50.0;

        {
            System.out.println("Digite o salario Bruto: " + "R$ ");
            salarioBruto = ler.nextDouble();
            
            ler.close();
        }
        {
            tributacao = ((salarioBruto + gratificao) * 0.1) / 1.0;
            salarioLiquido = (salarioBruto + gratificao) - tributacao;
        }

        System.out.println("O salário líquido é: " + "R$ " + salarioLiquido);
    }

}
