
package com.loiane.cursojava.aula09.poo.metodos.sobrecarga;

/*
Sobrecarga de métodos. Mesmo nome, com assinatura diferente. Parâmetros com 
nomes diferentes.
*/


public class MinhaCalculadora {
     public int somar(int num1 , int num2)
    {
        return num1 + num2;
    }
    
    public double somar(double num1 , double num2)
    {
        return num1 + num2;
    }
    
    public double somar(double num1 , double num2, double num3)
    {
        return num1 + num2 + num3;
    }
    
    public int somar(int[] vetorInteiros)
    {
        
        
        int total = 0;
        
        for(int i=0; i < vetorInteiros.length; i++)
        {
            total += vetorInteiros[i];
        }
        return total;
    }
}
