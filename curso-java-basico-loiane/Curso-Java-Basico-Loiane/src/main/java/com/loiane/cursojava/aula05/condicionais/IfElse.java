
package com.loiane.cursojava.aula05.condicionais;

import java.util.Scanner;

public class IfElse {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = input.nextInt();
        
        if(idade >= 18)
        {
            System.out.println("É maior de idade");
        }
        else
        {
            System.out.println("Nao é maior de idade");
        }
        
    }    
}
