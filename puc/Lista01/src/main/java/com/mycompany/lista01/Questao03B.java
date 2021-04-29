package com.mycompany.lista01;

public class Questao03B {

    public static void main(String[] args) {
        // definir dados
        int x = 0; // definir variavel com valor inicial
        double y = 3.5; // definir variavel com valor inicial
        char z = 'A'; // definir variavel com valor inicial
        boolean t, w = false; // definir variavel e variavel com valor inicial
// identificar
        System.out.printf("%s\n", "EXEMPLO - Programa - v0.0 - continuacao");
        System.out.printf("%s\n", "Autor: ______________________");
        System.out.printf("%n"); // mudar de linha
        w = true;
        System.out.printf("10. %s%b%n", "w = ", w);
        t = (w == false); // equivalente 'a comparacao de igualdade (true igual a false)
        System.out.printf("11. %s%b%n", "t = ", t);
        t = !(w == false); // equivalente ao contrario da comparacao de valores (true igual a false)
        System.out.printf("12. %s%b%n", "t = ", t);
        t = (w != false); // equivalente 'a comparacao de diferenca (true diferente de false)
        System.out.printf("13. %s%b%n", "t = ", t);
        w = (x < y); // equivalente 'a comparacao entre (x) e (y)
        System.out.printf("14. %s%d < %f = %b%n", "w = ", x, y, w);
        w = (x <= y); // equivalente 'a comparacao entre (x) e (y)
        System.out.printf("15. %s%d <= %f = %b%n", "w = ", x, y, w);
        w = (y > x); // equivalente 'a comparacao entre (x) e (y)
        System.out.printf("16. %s%f > %d = %b%n", "w = ", y, x, w);
        w = (y >= x); // equivalente 'a comparacao entre (x) e (y)
        System.out.printf("17. %s%f >= %d = %b%n", "w = ", y, x, w);
    }

}
