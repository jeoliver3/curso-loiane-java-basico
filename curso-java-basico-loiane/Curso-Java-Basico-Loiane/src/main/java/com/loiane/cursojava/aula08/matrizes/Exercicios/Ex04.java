
package com.loiane.cursojava.aula08.matrizes.Exercicios;

import java.util.Scanner;

public class Ex04 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         
         // Pedir idade dos pacientes e validar se é prioritário
         /*
         Dando um valor para a variável paciente e atribuindo ela no vetor idadePaciente, dessa forma, se por acaso o valor modificar
         dentro do código, o laço for continua executando normalmente de acordo com a mudança de valor. 
         */
         
         int    paciente = 5;
         int[] idadePaciente = new int[paciente]; //Vetor idadePaciente recebe paciente que tem valor 5;  
         for(int i = 0; i < paciente; i++)
         {
             System.out.println("Digite a idade do " + (i+1) + "º paciente ");
             idadePaciente[i] = input.nextInt();
         }
        for(int i = 0; i < paciente; i++)
        {
            if(idadePaciente[i] > 65)
            {
                System.out.println("Paciente com " + idadePaciente[i]  + " tem prioridade");            
            }
           
        }
       
     }
}
