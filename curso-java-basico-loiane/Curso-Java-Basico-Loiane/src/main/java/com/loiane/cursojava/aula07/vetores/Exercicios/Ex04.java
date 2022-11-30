
package com.loiane.cursojava.aula07.vetores.Exercicios;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Ex04 {
     public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    
        /*
        Criar um vetor A com 15 elementos inteiros. Criar um vetor B do mesmo tamanho.. Cada elemento do 
        VetorB deverá ser a raiz quadrada do respectivo elemento do vetorA ou seja VetorB[i] = sqrtVetorA[i];
        Utilizar Math.  A função Math.sqrt() retorna a raiz quadrada de um número 
        */
            int[]   vetorA = new int[15];  
            double[]   vetorB = new double[15];
          
             for(int i = 0; i < vetorA.length; i++)
         {
            System.out.println("Digite o valor da posição: " + i); // atribuindo valor ao vetor
            vetorA[i] = input.nextInt();
            
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
             
             System.out.print("Vetor A = " );
            for(int i = 0; i < vetorA.length; i++ )
            {
                System.out.print(vetorA[i] + " ");
            }
           /*
            Para que os números decimais não saiam muito grandes, utiliza-se a classe DecimalFormat que 
            permite formatar números reais. Pode-se usar a classe DecimalFormat para formatar números 
            decimais em sequências específicas para a localidade, a rash representa os números  dentro dos parametros, separados
            por pontos e vírgulas
            */

             System.out.println();

             DecimalFormat df = new DecimalFormat("###,###.00");

            System.out.print("Vetor B = " );
            for(int i = 0; i < vetorB.length; i++ )
            {
                System.out.print(df.format(vetorB[i]) + " ");
            }
}
}
