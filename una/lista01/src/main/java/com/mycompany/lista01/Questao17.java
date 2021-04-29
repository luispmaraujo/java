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
public class Questao17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double num, pot, rad = 0.0;
        
        {
            System.out.println("Digite um número real:");
            num = ler.nextDouble();
        }
        {
            pot = Math.pow(num, 2);
            rad = Math.sqrt(num);
            
            ler.close();
        }
        {
             System.out.println("O resultado da exponenciação do número real informado é: " + pot);
             System.out.println("O resultado da radiciação do número real informado é: " + rad);
        }
    }

}
