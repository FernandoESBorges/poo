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
    
    public double notaTotal(){
        return nota1+nota2+nota3;
    }
   
    public String toString(){
        if (notaTotal()>= 60) {
            return name+ " notas somadas: "+ notaTotal()+ " E voçê passou";
                   
            
        }
        else{
        return  name+ " notas somadas: "+ notaTotal()+ " E voçê não passou e faltou essa nota para atingir o 60%: "
                + (60-notaTotal());
        }
    }
    
    
    
}
