/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo;

import entities.RectangleMedidas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ferna
 */
public class ProgramRectangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RectangleMedidas rect = new RectangleMedidas();

        System.out.println("Enter rectang width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        
        System.out.println(rect);

    }

}
