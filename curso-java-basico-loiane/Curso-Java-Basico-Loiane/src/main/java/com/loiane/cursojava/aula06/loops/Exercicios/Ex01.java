
package com.loiane.cursojava.aula06.loops.Exercicios;

import java.util.Scanner;

public class Ex01 {
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do{ 
        
            System.out.println("digite uma nota de 0 a 10: ");
            double nota = input.nextDouble();
            
            if(nota >=0 && nota <=10)
            {
                notaValida = true;
                System.out.println("voce digitou " + nota);
            }
            else
            {
                System.out.println("Nota invalida ");
            }
            
        }
        while(!notaValida); // notaValida == false;
    } 
}
