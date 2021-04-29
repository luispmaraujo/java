package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04C {

    public static void main(String[] args) {

        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double mediaPonderada = 0.0;

        int peso1 = 0;
        int peso2 = 0;
        int peso3 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite o peso da primeira nota: ");
        peso1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite o peso da segunda nota: ");
        peso2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        System.out.println("Digite o peso da terceira nota: ");
        peso3 = entrada.nextInt();
        
        entrada.close();

        mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das três notas informadas é: " + mediaPonderada);
    }

}
