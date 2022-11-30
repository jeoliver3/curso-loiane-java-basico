
package com.loiane.cursojava.aula05.condicionais;

import java.util.Scanner;

public class Aninhados {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        double  valor = input.nextDouble();
        
        if(valor <= 10)
        {
            System.out.println("Produto no melhor valor!");
        }   
        else if(valor > 10 && valor < 15)
        {
            System.out.println("Produto com valor médio no mercado");
        }
        else if(valor  >= 15 && valor < 17)
        {
            System.out.println("Produto sem desconto, valor acima da média ");
        }
        else
        {
            System.out.println("Valor mais caro de todos");
        }
        
    }
}
