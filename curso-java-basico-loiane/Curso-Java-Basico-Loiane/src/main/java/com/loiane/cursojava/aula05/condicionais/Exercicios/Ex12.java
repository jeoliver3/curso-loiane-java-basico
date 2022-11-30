
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
      
        /* verificando se número é par ou ímpar.
        todo número dividido por 2 gera um resto 0 ou 1
         se gera resto 0 é par, se gera resto 1 é impar*/
        
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        
        
        if(num % 2 == 0 )
        {
            System.out.println("O número é par!");
        }        
        else
        {
         System.out.println("O número é ímpar!");   
        }
        

    }  
}
