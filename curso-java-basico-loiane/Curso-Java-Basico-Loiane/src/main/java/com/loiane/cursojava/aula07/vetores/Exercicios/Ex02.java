
package com.loiane.cursojava.aula07.vetores.Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    
         /*
        Criar um vetor A com 8 elementos inteiros. Criar um vetor B do mesmo tamanho e tipo. VetorB recebe VetorA * 2
        */
   
        int[]   vetorA = new int[8];
        int[]   vetorB = new int[8];
        
        for(int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Digite o valor da posição: " + i); // atribuindo valor ao vetor
            vetorA[i] = input.nextInt();
            
            vetorB[i] = vetorA[i] * 2 ;
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
