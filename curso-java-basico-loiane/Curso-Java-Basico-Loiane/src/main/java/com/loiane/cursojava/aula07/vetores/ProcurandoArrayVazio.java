
package com.loiane.cursojava.aula07.vetores;

public class ProcurandoArrayVazio {
    public static void main(String[]args)
    {
        int[] num = {12, 0, 15, 50, 8, 4};
        
         for(int i = 0; i < num.length; i++)
         {
             if(num[i] == 0)
             System.out.println("Array vazio é  " + num[i] + " na posicao " + i);
         } 
    
    }
}
