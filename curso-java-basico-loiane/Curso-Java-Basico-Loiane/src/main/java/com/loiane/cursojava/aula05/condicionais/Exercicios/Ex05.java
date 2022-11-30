
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        // verificando maior valor com 3 opçoes
        
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();
        
        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("Primeiro número é o maior número");
        }
        else if(num2 >= num3)
        {
            System.out.println("Segundo número é o maior número");
        }
        else
        {                
            System.out.println("Terceiro número é o maior número");
        }
    
      
    }
}
