
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex10 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        // mostrando o mais barato
        
        System.out.println("1 - Digite o primeiro preço: ");
        double preco1 = input.nextDouble();
        System.out.println("2 - Digite o segundo preço: ");
        double preco2 = input.nextDouble();
        System.out.println("3 - Digite o terceiro preço: ");
        double preco3 = input.nextDouble();
        
        if(preco1 <= preco2 && preco1 <= preco3)
        {
            System.out.println("Compre o produto 1 com valor de : " + preco1);
        }
        else if(preco2 <= preco3)
        {
            System.out.println("Compre o produto 2 com valor de : " + preco2);
        }
        else
        {
            System.out.println("Compre produto 3 com valor de " + preco3);
        }
        
        
    }
}
