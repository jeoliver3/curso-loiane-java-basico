
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex13 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
         // tabela de precos Hortifruti
         
         System.out.println("Digite a qtdade de morangos - kg: ");
         double morango = input.nextDouble();
         System.out.println("Digite a qtdade de maçãs - kg: ");
         double maca = input.nextDouble();
         
         double valorTotalMorango;
         double valorTotalMaca;
         double precoTotal = 0;
         
         
         
         double precoMorango = 0;
         
         if(morango <= 5)
         {
             precoMorango = 2.5;
         }
         else
         {
             precoMorango = 2.2;
         }
         valorTotalMorango = morango * precoMorango;
         
         
         double precoMaca = 0;
         
         if(maca <= 5)
         {
             precoMaca = 1.8;
         }
         else
         {
             precoMaca = 1.5;
         }
         
         valorTotalMaca = maca * precoMaca; 
         
         precoTotal = valorTotalMaca + valorTotalMorango;
         System.out.println("Preco total é de : " + precoTotal); 
    
    
    } 
}
