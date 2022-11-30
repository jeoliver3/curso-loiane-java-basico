
package com.loiane.cursojava.aula12.recursividade;


public class Teste {
    public static void main(String[] args) {
        
        
        System.out.println(CalculaFatorial.calculaFatorial(5));
        
        System.out.println(CalculaFatorial.fatorial(5));
        
        
        for(int i = 0; i < 10; i++)
        {
             System.out.print(Fibonacci.calcularFibonacci(i) + " ");
             //Obtendo a série de Fibonacci, dos 10 primeiros núneros
        }
    }
}
