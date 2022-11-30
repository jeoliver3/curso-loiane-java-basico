
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
    
        // lendo 3 números e executando o menor
        
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = input.nextInt();
    
        if(numero1 <= numero2 && numero1 <= numero3)
        {
            System.out.println("O primeiro número  é o menor número");
        }
        else if(numero2 <= numero3)
        {
            System.out.println("O segundo número é o menor número");
        }
        else
        {                
            System.out.println("O terceiro número é o menor número");
        } 
    
} 
}
