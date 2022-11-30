
package com.loiane.cursojava.aula12.recursividade;


public class Fibonacci {
    
    public static int calcularFibonacci(int num)
    {
        if(num < 2)
        {
            return 1;
        }
        return calcularFibonacci(num-1) + calcularFibonacci(num-2);
    }
}
