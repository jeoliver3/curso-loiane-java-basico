
package com.loiane.cursojava.aula21.exceptions;

//Tratando várias exceções no Java

public class MultiplosCatch {
   
    public static void main(String[]args)
    {
        int[] numeros = {4,8,16,32,64,128};
        int[] denominador = {2,0,4,8,0,4};
        
        for(int i = 0; i < numeros.length; i++)
        {
           try
           {
             System.out.println(numeros[i] +" / " +denominador[i] + " = " + (numeros[i] / denominador[i]));
           }
           catch(ArithmeticException exception)
           {
                System.out.println("Erro ao dividir por 0");
           }
           catch(ArrayIndexOutOfBoundsException exception)
           {
                System.out.println("Posiçnao do array inválida");
           }
        }
      
    
    }
}
