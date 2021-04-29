package com.mycompany.lista01;

public class Questao03C {

    public static void main(String[] args) {
        // definir dados
        int x = 0; // definir variavel com valor inicial
        double y = 3.5; // definir variavel com valor inicial
        char z = 'A'; // definir variavel com valor inicial
        boolean w = false; // definir variavel com valor inicial
// identificar
        System.out.printf("%s\n", "EXEMPLO - Programa - v0.0 - continuacao");
        System.out.printf("%s\n", "Autor: ______________________");
        System.out.printf("\n"); // mudar de linha
        x = 4;
        w = (x % 2 == 0); // equivalente a testar se é par ou
// resto inteiro (%) da divisao por 2 igual a zero
        System.out.printf("18. %s (%d) ? %b%n", "e' par ", x, w);
        x = 4;
        w = (x % 2 != 0); // equivalente a testar se é ímpar ou
// resto inteiro (%) da divisao por 2 diferente de zero
        System.out.printf("19. %s (%d) ? %b%n", "e' impar ", x, w);
        z = 'x';
        w = ('a' <= z && z <= 'z'); // equivalente a testar se e' letra minuscula
        System.out.printf("20. %s (%c) ? %b%n", "e' minuscula ", z, w);
        z = 'x';
        w = ('A' <= z && z <= 'Z'); // equivalente a testar se e' letra maiuscula
        System.out.printf("21. %s (%c) ? %b%n", "e' maiuscula ", z, w);
        z = '0';
        w = ('0' == z || '1' == z); // equivalente a testar se e' igual a '0' ou a '1'
        System.out.printf("22. %s (%c) ? %b%n", "e' 0 ou 1 ", z, w);
    }

}
