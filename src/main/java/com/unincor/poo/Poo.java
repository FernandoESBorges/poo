/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unincor.poo;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Ferna
 */
public class Poo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome:");
        aluno.name = sc.nextLine();
        System.out.println("Digite a primeira nota:");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a Segunda nota :");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Digite a Teceira nota: ");
        aluno.nota3 = sc.nextDouble();
        
        System.out.println(aluno);
    }
}
