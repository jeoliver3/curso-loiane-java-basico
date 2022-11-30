
package com.loiane.cursojava.aula07.vetores.Exercicios;

import java.util.Scanner;

public class Ex03 {
   public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);    
     /*
        Criar um vetor A com 15 elementos inteiros. Criar um vetor B do mesmo tamanho e tipo. Cada elemento do 
        VetorB deverá ser o quadrado do respectivo elemento do vetorA ou seja VetorB[i] = VetorA[i] * VetorA[i]
        */
                int[]   vetorA = new int[15];
                int[]   vetorB = new int[15];
        
             for(int i = 0; i < vetorA.length; i++)
         {
            System.out.println("Digite o valor da posição: " + i); // atribuindo valor ao vetor
            vetorA[i] = input.nextInt();
            
            vetorB[i] = vetorA[i] * vetorA[i] ;
        }
     
      System.out.print("Vetor A = " );
            for(int i = 0; i < vetorA.length; i++ )
            {
                System.out.print(vetorA[i] + " ");
            }
           
             System.out.println();
            
            System.out.print("Vetor B = " );
            for(int i = 0; i < vetorB.length; i++ )
            {
                System.out.print(vetorB[i] + " ");
            }
       
} 
}
