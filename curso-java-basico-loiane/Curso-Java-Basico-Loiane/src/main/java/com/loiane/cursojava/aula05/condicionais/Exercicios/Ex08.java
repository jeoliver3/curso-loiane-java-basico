
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex08 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
          
        /*calculo de aumento de salário, mostrando o percentual e valor 
        de salario novo e antigo*/
        
        System.out.println("Digite o valor do salário: ");
        double  salario = input.nextDouble();
        int percent = 0;
        double  aumento;
        double  reajuste;
        
        if(salario <= 280)
        {
            percent = 20;
            
        }
        else if(salario > 280 && salario  <= 700)
        {
            percent = 15;
            
        }
        else if(salario > 700 && salario < 1500)
        {
            percent = 10;
            
        }
        else
        {
           percent = 5;
            
        }
        
        aumento = (salario / 100) * percent;
        reajuste = salario + aumento;
        
        System.out.println("Salário " + salario);
        System.out.println("Percentual " + percent);
        System.out.println("Aumento " + aumento);
        System.out.println("Reajuste " + reajuste); 
 
    
    }
}
