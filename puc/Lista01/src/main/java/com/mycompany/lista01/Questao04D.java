package com.mycompany.lista01;

import java.util.Scanner;

public class Questao04D {

    public static void main(String[] args) {

        double temperaturaCelsius = 0.0;
        double temperaturaFahrenheit = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura desejada em  graus Celsius: ");
        temperaturaCelsius = entrada.nextDouble();
        
        entrada.close();

        temperaturaFahrenheit = temperaturaCelsius * (1.8) + 32;

        System.out.println("A temperatura informada equivale a " + temperaturaFahrenheit + " graus Fahrenheit");
    }

}
