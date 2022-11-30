
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;


public class Ex11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        /* verificando se ano é bissexto. Para que um ano seja bissexto:
        tem que ser divisível por 4, não pode ser divisível por 100
        ou ser divisível por 400*/

        System.out.println("Informe um ano: ");
        int ano = input.nextInt();
        
        if((ano % 4  == 0 && ano % 100 != 0) || (ano % 400 == 0))
        {
            System.out.println("É um ano bissexto");
        }
        else
        {
             System.out.println("Não é um ano bissexto");
        }
        
    }
}
