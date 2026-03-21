/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo;

import com.unincor.poo.util.CalculatorDolar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double dolar = sc.nextDouble();
        int quant = sc.nextInt();

        double total = CalculatorDolar.DolarConverter(dolar, quant);

        System.out.println("What is the dollar price? " + dolar);
        System.out.println("How many dollars will be bought? " + quant);
        System.out.println("Amount to be paid in reais = " + total);

    }

}
