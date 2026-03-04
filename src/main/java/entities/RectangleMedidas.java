/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Ferna
 */
public class RectangleMedidas {

    public double width;
    public double height;

    public double Area() {
        return (width * height);

    }

    public double Perimetro() {

        return (width + height) * 2;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {

        return "Area: " + String.format("%.2f", Area()) + "\nPerimeter: " + String.format("%.2f", Perimetro()) + "\nDiagonal: "+ String.format("%.2f", diagonal());
    }

}
