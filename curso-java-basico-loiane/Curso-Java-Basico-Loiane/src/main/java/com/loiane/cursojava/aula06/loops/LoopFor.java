
package com.loiane.cursojava.aula06.loops;


public class LoopFor {
    public static void main(String[] args)
    {
        /*
        Loop for inicializa a variável dentro da expressão, add a condição 
        booleana e incrementa ou decrementa. Essa variável declarada, apenas 
        pertence ao escopo do for, não podendo ser utilizada globalmente no 
        programa.
         */
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("i tem valor de: " + i);
        }
    
        for(int i = 5; i >= 0; i--)
        {
            System.out.println("i tem valor de: " + i);
        }
        
        
        /* 
        for com mais de uma variável, sendo separadas por vírgula.
        quando incremento i e ele tem o valor de 5 e decremento o j que tb
        vai ter o valor de 5. 5 é menor do que 5 ? não. então ele para de 
        executar
        */
        
        for(int i = 0,  j = 10; i < j ; i++, j--)
        {
            System.out.println("i = " + i + " j é = " + j);
               
        }
         
         
         // for com partes ausentes
         
         int    i = 0;
         for(; i < 5;)
         {
             System.out.println("valor de i é : " + i);
             i+= 2;
         }
         
         /*
            Fazendo cálculo (soma) com for sem corpo. 0+1+2+3+4
         */
         
         int    soma = 0;
         for(int x = 1; x <= 5; soma += x++)
             System.out.println("O valor da soma é de : " + soma);
        
    
    }
}
