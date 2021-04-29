/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 3.	Crie um programa que leia um número real e imprima a raiz quadrada do
 * número caso ele seja positivo e o quadrado do número caso ele seja negativo.
 */
public class Questao03 {

    public static void main(String[] args) {

        double numero = 0.0;
        double radiciacao = 0.0;
        double exponenciacao = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número real: ");
        numero = sc.nextDouble();

        sc.close();

        radiciacao = Math.sqrt(numero);
        exponenciacao = Math.pow(numero, 2);

        /**
         * A regra da potenciação é: Se um número negativo estiver elevado a um
         * número par, então o resultado é positivo. Se um número negativo
         * estiver elevado a um número ímpar, então o resultado é negativo. Essa
         * regra é válida porque sabemos que na multiplicação menos com menos dá
         * mais e menos com mais dá menos.
         */
        
        if (numero > 0) {
            System.out.println("A raiz quadrada do número informado é: " + radiciacao);
        } else {
            if (numero < 0) {
                System.out.println("A exponenciação do número informado é: " + exponenciacao);
            }
        }

    }

}
