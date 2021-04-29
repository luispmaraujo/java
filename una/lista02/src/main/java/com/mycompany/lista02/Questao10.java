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
 * 10.	Crie um programa que leia a sigla do estado de uma pessoa e imprima uma
 * das mensagens: "Mineiro", "Capixaba", "Carioca", "Paulista", "Outro Estado".
 * Não esqueça de validar as siglas, ou seja, se elas possuem mais ou menos de 2
 * caracteres.
 */
public class Questao10 {

    public static void main(String[] args) {

        String estado = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sigla do seu estado: ");
        estado = sc.next();      

        sc.close();

        switch (estado) {

            case "MG":
                System.out.println("Mineiro");
                break;

            case "mg":

                System.out.println("Mineiro");
                break;

            case "ES":
                
                System.out.println("Capixaba");
                break;
                
            case "es":
                    
                System.out.println("Capixaba");
                break;

            case "RJ":
                
                System.out.println("Carioca");
                break;
                
            case "rj":
                
                System.out.println("Carioca");
                break;

            case "SP":
                
                System.out.println("Paulista");
                break;
            
            case "sp":
                
                System.out.println("Paulista");
                break;

            default:
                
                System.out.println("Outro estado");
                break;
        }

    }

}
