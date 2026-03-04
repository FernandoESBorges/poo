/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class ProgramFuncionario {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcio = new Funcionario();
        
        System.out.println("Coloque seu dados: ");
        System.out.print("Digite seu nome: ");
        funcio.name = sc.nextLine();
        
        System.out.print("Digite seu salario bruto: ");
        funcio.grossSalary = sc.nextDouble();
        
        System.out.print("Digite a taxa paga: ");
        funcio.tax = sc.nextDouble();
        
        System.out.println("Employee: "+funcio);
        
        System.out.print("Digite porcentagem de aumento do salário: ");
        funcio.increaseSalary(sc.nextDouble());
        
        System.out.println("upadate data: "+ funcio);
        
    }

}
