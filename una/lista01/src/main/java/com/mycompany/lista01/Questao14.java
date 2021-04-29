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
public class Questao14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, dezena = 0;

        {
            System.out.println("Digite um número de três dígitos: ");
            num = ler.nextInt();
            
            ler.close();
        }

        dezena = (num % 100) / 10;

        System.out.println("O número da casa das dezenas é: " + dezena);

    }

}
