
package com.loiane.cursojava.aula08.matrizes.Exercicios;

public class Ex05 {
     public static void main(String[] args)
     {
         int[][] matrix = new int[3][3];
         matrix[0][0]= 10;
         matrix[0][1]= 20;
         matrix[0][2]= 30;
         matrix[1][0]= 40;
         matrix[1][1]= 50;
         matrix[1][2]= 60;
         matrix[2][0]= 70;
         matrix[2][1]= 80;
         matrix[2][2]= 90;
         
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    System.out.print(i+"|" +j+ "=" +matrix[i][j] + "\t"); 
                    /* i  e j indice percorrendo array, matrix[i][j] traz o valor atribuido a posição i e j 
                    "\t" contrabarra t imprime um tab de 4 espaços de uma vez.
                    */
                }
                    System.out.println("\n");
            }
         
         
     }
}
