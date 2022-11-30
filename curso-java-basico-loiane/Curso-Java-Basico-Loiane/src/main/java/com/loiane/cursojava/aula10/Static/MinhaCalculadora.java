
package com.loiane.cursojava.aula10.Static;

/*
O modificador static torna métodos e variáveis acessíveis sem ter a necessidade 
de instanciar uma classe ou declarar a variável no mesmo escopo.
Somente chamando a classe no main com o método, como mostra no arquivo main 
TesteCalculadora.
*/

public class MinhaCalculadora {
  
    static public int somar(int num1 , int num2)
    {
        return num1 + num2;
    }
    
    static public double somar(double num1 , double num2)
    {
        return num1 + num2;
    }
    
    static public double somar(double num1 , double num2, double num3)
    {
        return num1 + num2 + num3;
    }
    
    static public int somar(int[] vetorInteiros)
    {
        
        
        int total = 0;
        
        for(int i=0; i < vetorInteiros.length; i++)
        {
            total += vetorInteiros[i];
        }
        return total;
    }   
}
