
package com.loiane.cursojava.aula06.loops;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args)
    {
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite um número inteiro: ");
            int num = input.nextInt();
            System.out.println("Digite um número inteiro para ser o máximo: ");
            int max = input.nextInt();
            
            /*
                i recebe num do input. Enquanto i for menor ou igual ao max recebido do input, incrementa.
                Abaixo entra a condição de, se i que recebe num for um valor divisivel por 7 com resto 0, ele executa 
                e sai do programa com break.
                Mas se não tiver o break, ele vai executar até o número máximo indicado no input e vai mostrar os
                divisiveis por 7 até o numero máximo.
                */
             
            for(int i = num; i <= max; i++)
                
         {
                System.out.println(i);
                
                if(i  % 7 == 0) // se i for um numero divisivel por 7 e o módulo for 0;
                {
                    
                    System.out.println("O valor de i é : " + i);
                    
                    break;
                }
                 /*
                Continue - os numeros divisiveis por 7 com resto 0 não serão executados. Ele vai para a proxima
                iteração (continue) do for e não executa a condição do if. Pode ser bem utilizado qdo se tem for
                aninhados (for dentro de for) e opte pelo continue para pular algum for.
                */    
               
                System.out.println("Digite um número inteiro: ");
                int numero = input.nextInt();
                System.out.println("Digite um número inteiro para ser o máximo: ");
                int maximo = input.nextInt();
            
                 for(int x = numero; x <= maximo; x++)
                 {
                     if(x  % 7 == 0)
                     {
                          continue;
                     }
                     System.out.println("O valor de x é : " + x);  
                     
                 }                         
                       
            }
    }
}
