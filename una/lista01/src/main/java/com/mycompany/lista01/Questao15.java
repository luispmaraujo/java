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
public class Questao15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, media = 0.0;

        {
            System.out.println("Insira a primeira nota:");
            nota1 = (ler.nextDouble();

            System.out.println("Insira a segunda nota:");
            nota2 = ler.nextDouble();

            System.out.println("Insira a terceira nota:");
            nota3 = ler.nextDouble();
            
            ler.close();
        }

        media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("A média artmética das notas informadas é: " + media);
    }

}
