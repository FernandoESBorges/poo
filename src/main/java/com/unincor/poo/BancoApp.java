/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo;

import entities.BancoConta;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class BancoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deposito = 0;

        System.out.println("Bem vindo a cadastro de conta do banco");
        System.out.println("Digite o numero da conta");
        String numeroConta = sc.nextLine();

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Deseja fazer um deposito");
        System.out.println("S/N");
        String fazerDeposito = sc.nextLine();

        if (fazerDeposito.contains("S")) {
            System.out.println("Digite o valor do deposito:");
            deposito = sc.nextDouble();

        }
        BancoConta bc = new BancoConta(deposito, nome, numeroConta);

        System.out.println(bc);
        int loop = 0;
        do {
            System.out.println("");
            System.out.println("Digite numero da acao que deseja fazer:");
            System.out.println("1 - deposito");
            System.out.println("2 - saque");
            System.out.println("3 - sair");
            loop = sc.nextInt();

            if (loop == 1) {
                System.out.println("Digite o valor do deposito:");
                deposito = sc.nextDouble();
                bc.Deposito(deposito);
            } else if (loop == 2) {
                System.out.println("Digite o valor de saque:");
                double saque = sc.nextDouble();

                bc.Saque(saque);

            }

            System.out.println(bc);
        } while (loop <= 3);

    }

}
