/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luís Paulo Maia de Araújo
 */
public class Questao07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        {
            System.out.println("Digite o primeiro número");
            num1 = ler.nextInt();

            
            System.out.println("Digite o segundo número");
            num2 = ler.nextInt();
            ler.close();

        }
        {
            System.out.println("O primeiro número digitado é: " + num1);
            System.out.println("O segundo número digitado é: " + num2);
        }
    }

}
