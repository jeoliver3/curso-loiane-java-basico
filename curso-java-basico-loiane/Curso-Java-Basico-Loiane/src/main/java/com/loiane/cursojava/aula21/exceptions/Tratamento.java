
package com.loiane.cursojava.aula21.exceptions;

/*
try: bloco que é monitorado para erros.
catch: tipo da Exception,tratamebto de erro e variável.
No java, Exceptions também são objetos.
try: tente executar, caso haja erro,
catch: capture a exceção e trate o erro.
*/
public class Tratamento {
    public static void main(String[]args)
    {
        
        try
        {
        int[] vetor = new int[4];
        System.out.println("Antes da exception");
        
        vetor[4] = 1;
        System.out.println("Esse texto não será impresso");
        }
        catch(ArrayIndexOutOfBoundsException exception)
         {
             System.out.println("Exceção ao acessar um index do vetor que não existe");   
         }
          
        System.out.println("Esse texto será impresso após a exception");
    }
}
