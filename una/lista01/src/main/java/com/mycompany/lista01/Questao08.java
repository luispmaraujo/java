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
public class Questao08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int entrada, sucessor, antecessor = 0;
        
        {
            System.out.println("Digite o número desejado:");
            entrada = ler.nextInt();
            
            ler.close();
        }
        {
            sucessor = (entrada + 1);
            antecessor = (entrada - 1);
        }
        {
            System.out.println("O sucessor do número informado é: " + " " + sucessor);
            System.out.println("O antecessor do número informado é:" + " " + antecessor);
        }

    }

}
