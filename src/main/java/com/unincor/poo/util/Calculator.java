/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.poo.util;

/**
 *
 * @author Fernando
 */
public class Calculator {
    public final double PI = 3.14159;
    
     public  double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public  double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
