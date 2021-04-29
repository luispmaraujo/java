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
public class Questao25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double x, quadrado, cubo, raizQuadrada, raizCubica = 0.0;

        {
            System.out.println("Digite o número desejado: ");
            x = ler.nextDouble();
            
            ler.close();
        }
        {
            quadrado = Math.pow(x, 2);
            cubo = Math.pow(x, 3);

            raizQuadrada = Math.sqrt(x);
            raizCubica = Math.cbrt(x);
        }
        {
            System.out.println("O quadrado do número informado é: " + quadrado);
            System.out.println("O cubo do número informado é: " + cubo);

            System.out.println("A raiz quadrada do número informado é: " + raizQuadrada);
            System.out.println("A raiz cúbica do número informado é: " + raizCubica);
        }

    }

}
