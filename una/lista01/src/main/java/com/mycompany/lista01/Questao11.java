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
public class Questao11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num, divisao = 0.0;

        {
            System.out.println("Digite o número desejado:");
            num = ler.nextDouble();
            
            ler.close();
        }

        divisao = num / 3.0;

        System.out.println("A terça parte do número informado é:" + " " + divisao);
    }

}
