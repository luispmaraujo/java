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
public class Questao24 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double a, d, r = 0.00;
        
        {
            System.out.println("Insira o valor do diâmetro do círculo: ");
            d = ler.nextDouble();
            
            ler.close();
        }
        {
            r = d / 2;
            a = Math.PI * (Math.pow(r, 2));
        }
        
        System.out.println("A área do círculo é:" + a);
    }
}
