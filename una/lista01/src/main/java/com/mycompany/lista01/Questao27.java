/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class Questao27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double inch, ft, yd, mi = 0.0;
        
        {
            System.out.println("Insira o valor da medida em pés: ");
            ft = ler.nextDouble();
            
            ler.close();
        }
        {
          inch = (double) ft * 12;
          yd = (double) ft / 3;
          mi = ft / 5280;
        }
        {
            System.out.println("A mediada em Polegadas é: " + inch);
            System.out.println("A medida em Jardas é: " + yd);
            System.out.println("A medida em Milhas é: " + mi);
        }
    }
    
}
