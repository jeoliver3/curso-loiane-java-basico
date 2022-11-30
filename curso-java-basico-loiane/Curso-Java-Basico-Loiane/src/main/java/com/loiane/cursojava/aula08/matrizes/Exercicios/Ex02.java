
package com.loiane.cursojava.aula08.matrizes.Exercicios;

import java.util.Scanner;

public class Ex02 {
     public static void main(String[] args) 
    {
        /*
           Receba 3 valores para preenchimento de uma matriz 3x3. Imprima a matriz criada e encontre a qtdade de 
            números pares e ímpares.
         */

        int[][] num = new int[3][3]; // declarando a matriz

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++)// fazendo iteração na matriz
        {
            for (int j = 0; j < num[i].length; j++) 
            {
                System.out.println("Digite o valor da posição [" + i + ", "+ j +"]" );
                num[i][j] = input.nextInt();
            }
    
        }
         for (int i = 0; i < num.length; i++)// fazendo iteração na matriz
        {
            for (int j = 0; j < num[i].length; j++) 
            {
               System.out.print(num[i] [j] + " " );       // imprimindo matriz com índice do input
            }
                System.out.println();
            
        }
         
         int    par = 0;
         int    impar = 0;
         
         for (int i = 0; i < num.length; i++)// fazendo iteração na matriz
        {
            for (int j = 0; j < num[i].length; j++) 
            {   
                if(num[i][j] % 2 == 0) /*se algum número na iteração do indice i e indice j for divisivel por 2 com resto 0, conta os 
                    pares, senão forem pares conta os ímpares.*/
                {
                    par++; 
                }
                else
                {
                    impar++;
                } 
            }
            
        } 
         
          System.out.println("Pares: " + par);
          System.out.println("Impares: " + impar);
    }
}
