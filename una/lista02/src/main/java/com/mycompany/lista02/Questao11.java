/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 11.	Crie um programa que leia um nome e verifique se o primeiro caractere é
 * uma vogal; considere que o usuário pode digitar letras minúsculas ou
 * maiúsculas.
 */
public class Questao11 {

    public static void main(String[] args) {

        String N = null;
        char c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Gigite um nome simples: ");
        System.out.println("Exemplo: Luis");
        N = sc.next();
        c = N.charAt(0);

        System.out.println(N);

        switch (c) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("a letra " + c + " é uma vogal");

                break;

            default:

                System.out.println("A letra " + c + " é uma consoante");
        }

    }

}
