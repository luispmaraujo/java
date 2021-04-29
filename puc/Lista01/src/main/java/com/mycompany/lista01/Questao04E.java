package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04E {

    public static void main(String[] args) {

        double salarioAtual = 0.0;
        double porcentagemAumento = 0.0;
        double aumento = 0.0;
        double salarioFinal = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do salário atual: ");
        salarioAtual = entrada.nextDouble();

        System.out.println("Informe a porcentagem de aumento: ");
        porcentagemAumento = entrada.nextDouble();
        
        entrada.close();

        aumento = salarioAtual * (porcentagemAumento / 100);
        salarioFinal = salarioAtual + aumento;

        System.out.println("O novo salário é: " + salarioFinal);
    }

}
