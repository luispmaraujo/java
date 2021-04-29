package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04F {

    public static void main(String[] args) {

        double area = 0.0;
        double base = 0.0;
        double altura = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a base do triângulo: ");
        base = entrada.nextDouble();

        System.out.println("Insira a altura do triângulo: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);
    }

}
