
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
         //tabela de descontos posto de gasolina
        
        System.out.println("Digite qtdd de litros: ");
        double  qtdadeLitros = input.nextDouble();
        System.out.println("Digite A para ácool ou G para gasolina: ");
        String  tipo = input.next();
        
        double  valorAlcool = 2.5;
        double  valorGasolina = 1.9;
        
        double  percent = 0;
        double  totalComDesconto = 0;
        double  valorTotal = 0;
        double  totalApagar;   

        
        if(tipo.equalsIgnoreCase("a"))
        {
            if(qtdadeLitros <= 20)
            {
                percent = 3;
            }
            else
            {
                percent = 5;
            }
            valorTotal = qtdadeLitros * valorAlcool;
        }
           
            
          else if(tipo.equalsIgnoreCase("g"))
                 {   
                    if(qtdadeLitros <= 20)
                    {
                        percent = 4;
                    }
                 
                 else
                 {
                    percent = 6;
                 }
                    valorTotal = qtdadeLitros * valorGasolina;
                 }
        
                
                totalComDesconto = (valorTotal / 100) * percent;
                totalApagar = valorTotal - totalComDesconto;
                System.out.println("Total a pagar é: " + totalApagar );
        
    
    }
}
