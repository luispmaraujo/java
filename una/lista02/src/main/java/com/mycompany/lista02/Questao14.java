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
 * 14.	Dados três valores X, Y e Z, verifique se eles podem ser os comprimentos
 * dos lados de um triângulo e, se forem, verifique se é um triângulo
 * equilátero, isósceles ou escaleno. Se eles não formarem um triângulo, escreva
 * uma mensagem informando.
 *
 * Considere que: A. O comprimento de cada lado de um triângulo é menor que a
 * soma dos outros dois lados; B. Chama-se equilátero o triângulo que tem três
 * lados iguais; C. Denomina-se isósceles o triângulo que tem o comprimento de
 * dois lados iguais; D. Recebe o nome de escaleno o triângulo que tem os três
 * lados diferentes.
 */
public class Questao14 {

    public static void main(String[] args) {

        double base, lado1, lado2 = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a medida da base do triângulo: ");
        base = sc.nextDouble();

        System.out.println("Informe a medida do primeiro lado do triângulo: : ");
        lado1 = sc.nextDouble();

        System.out.println("Informe a medida do segundo lado do triângulo: : ");
        lado2 = sc.nextDouble();

        sc.close();

        if (base == lado1 && lado1 == lado2 && lado2 == base && base != 0 && lado1 != 0 && lado2 != 0) {
            System.out.println("O triângulo é equilátero.");
        }

        if (base > lado1 && base > lado2 && lado1 == lado2 && base != 0 && lado1 != 0 && lado2 != 0) {
            System.out.println("O triângulo é isósceles.");
        }

        if (base > lado1 && lado1 > lado2 && lado2 > base || base < lado1 || lado1 < lado2 || lado2 < base && base != 0 && lado1 != 0 && lado2 != 0) {
            System.out.println("O triângulo é escaleno.");
        }

        if (base <= 0 || lado1 <= 0 || lado2 <= 0) {
            System.out.println("Com base nas medidas informadas a figura geométrica não se trata de um triângulo.");
        }
    }

}
