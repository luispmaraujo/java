package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04A {

    public static void main(String[] args) {
        int numero;
        int sucessor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        numero = entrada.nextInt();

        entrada.close();

        sucessor = numero + 1;

        System.out.println("O sucessor do número informado é: " + sucessor);
    }

}
