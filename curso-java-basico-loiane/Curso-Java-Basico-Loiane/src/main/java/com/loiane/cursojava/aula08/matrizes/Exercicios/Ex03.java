
package com.loiane.cursojava.aula08.matrizes.Exercicios;

import java.util.Scanner;

public class Ex03 {
     public static void main(String[] args) 
    {
       
        int[][] matrix = new int[3][3]; // declarando a matriz

        Scanner input = new Scanner(System.in);
        
            for (int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    System.out.println("Digite o valor: " );
                    matrix[i][j] = input.nextInt();
                }         
            }
            // Apresentando linha e coluna da matriz com os valores do input
            
        for (int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    System.out.println("matrix["+i+"]["+j+"] = " + matrix[i][j]);
                }
                
            }
               
    }
}
