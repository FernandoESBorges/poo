/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Ferna
 */
public class Aluno {
    
    public String name;
    public double nota1, nota2, nota3;
    
    public double notalTotal(){
        return nota1+nota2+nota3;
    }
    
    
    
}
