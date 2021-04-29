package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04B {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int mediaAritmetica = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        numero3 = entrada.nextInt();

        System.out.println("Digite o quarto número inteiro: ");
        numero4 = entrada.nextInt();
        
        entrada.close();

        mediaAritmetica = (numero1 + numero2 + numero3 + numero4) / 4;

        System.out.println("A média aritmética dos quatro números inteiros informados é: " + mediaAritmetica);
    }

}
