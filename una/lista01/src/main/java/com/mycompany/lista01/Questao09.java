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
public class Questao09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome, endereco, telefone = null;

        {
            System.out.println("Digite seu nome:");
            nome = ler.nextLine();
        }
        {
            System.out.println("Digite seu endereco:");
            endereco = ler.nextLine();
        }
        {
            System.out.println("Digite seu telefone:");
            telefone = ler.nextLine();
            
            ler.close();
        }
        System.out.println("Seu nome é: " + nome + "\n" + "Seu endereço é:" + " " + endereco + "\n" + "Seu telefone é:" + " " + telefone);

    }

}
