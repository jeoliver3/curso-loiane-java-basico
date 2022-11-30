
package com.loiane.cursojava.aula03.input;

import java.util.Scanner;

public class EntradaDados {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Digite o seu nome completo: ");
         String nomeCompleto = input.nextLine();
         
         System.out.println("Nome completo é : " + nomeCompleto);
    
         System.out.println("Digite o seu nome: ");
         String primeiroNome = input.next();
         
         System.out.println("Primeiro nome é: " + primeiroNome);
         // next sem o line, apenas executa uma palavra, diferente de nextline
         // que executa a linha toda.
         
         System.out.println("Digite sua idade: ");
         int idade = input.nextInt();
         
         System.out.println("Sua idade é: " + idade);
         
         
         
         
                  
     }
}
