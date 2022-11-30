
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex02 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // mostrando se valor do input é positivo ou negativo
        
        System.out.println("Digite um valor: ");
        double  valor = input.nextDouble();
        
        if(valor >= 0)
        {
            System.out.println("valor é positivo");
        }
        else
        {
            System.out.println("Valor é negativo");
        }
        
      
    }
}
