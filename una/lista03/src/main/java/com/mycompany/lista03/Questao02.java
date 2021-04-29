/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author Luís Paulo Maia de Araújo
 *
 * 2.	Uma pequena loja de artesanato possui apenas um vendedor e comercializa
 * dez tipos de objetos.
 *
 * O vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do
 * valor total de suas vendas.
 *
 * O valor unitário dos objetos deve ser informado e armazenado em um vetor; a
 * quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma
 * posição.
 *
 * Crie um programa que receba os preços e as quantidades vendidas,
 * armazenando-os em seus respectivos vetores (ambos com tamanho dez).
 *
 * Depois, determine e mostre:
 *
 * A.	Um relatório na tela contendo: quantidade vendida, valor unitário e valor
 * total de cada objeto. Ao final, deverão ser mostrados o valor geral das
 * vendas e o valor da comissão que será paga ao vendedor;
 *
 * B.	O valor do objeto mais vendido e sua posição no vetor (não se preocupe com
 * empates).
 *
 */
public class Questao02 {

    public static void main(String[] args) {

        //Declaração
        String produto = null;
        String produtoMaisVendido = null;

        int quantidadePosicoes = 10;
        int posicaoVetor = 0;
        int quantidadeVendida = 0;
        int quantidadeMaisVendido = 0;

        double precoUnitario = 0.0;
        double totalVenda = 0.0;
        double taxaComissao = 0.05;
        double valorComissao = 0.0;
        double salarioInicial = 545.0;
        double salarioFinal = 0.0;
        double precoMaisVendido = 0.0;

        //Vetores
        String[] vetorProduto = new String[quantidadePosicoes];
        double[] vetorPreco = new double[quantidadePosicoes];
        int[] vetorQuantidade = new int[quantidadePosicoes];

        Scanner sc = new Scanner(System.in);

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicoes; posicaoVetor++) {

            System.out.println("Insira o nome do produto: ");
            vetorProduto[posicaoVetor] = sc.next();
            produto = vetorProduto[posicaoVetor];

            System.out.println("Insira o preço do produto: ");
            vetorPreco[posicaoVetor] = sc.nextDouble();
            precoUnitario = vetorPreco[posicaoVetor];

            System.out.println("Insira a quantidade vendida do produto: ");
            vetorQuantidade[posicaoVetor] = sc.nextInt();
            quantidadeVendida = vetorQuantidade[posicaoVetor];

            System.out.println("");
            System.out.println("");

            System.out.println("O nome do produto é: " + produto);
            System.out.println("O preço unitário do produto é: R$" + precoUnitario);
            System.out.println("Quantidade de produtos vendida: " + quantidadeVendida + " unidades.");

            System.out.println("");
            System.out.println("");

            totalVenda += (precoUnitario * quantidadeVendida);
            valorComissao = totalVenda * taxaComissao;
        }

        sc.close();

        System.out.println("O valor total das vendas é de: R$" + totalVenda);
        System.out.println("O valor total da comissão a ser recebido é de: R$" + valorComissao);

        System.out.println("");
        System.out.println("");

        salarioFinal = salarioInicial + valorComissao;

        System.out.println("O salário total a ser recebido é de R$" + salarioFinal);

        for (posicaoVetor = 0; posicaoVetor < quantidadePosicoes; posicaoVetor++) {
            if (quantidadeMaisVendido < vetorQuantidade[posicaoVetor]) {
                quantidadeMaisVendido = vetorQuantidade[posicaoVetor];
                precoMaisVendido = vetorPreco[posicaoVetor];
                produtoMaisVendido = vetorProduto[posicaoVetor];
            }
        }
        System.out.println("");
        System.out.println("");

        System.out.println("O produto mais vendido é: " + produtoMaisVendido);
        System.out.println("O preço do item mais vendido é: " + precoMaisVendido);
        System.out.println("A quantidade do item mais vendido é: " + quantidadeMaisVendido);
    }
}
