
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex04 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        
        // Verificar se é vogal ou consoante
        
        System.out.println("Digite uma letra: ");
        String letra = input.next();
        
        if(letra.length() > 1)
        /*length verifica qtdade de caracteres. Se for maior que 1, quer
         dizer que tenho mais de uma letra, então se torna um input inválido
         para o programa. Importante fazer esse tipo de teste qdo input.*/
        {
            System.out.println(" nao é uma letra válida");
        }
        else{
        
        switch(letra)
        {
            case "a":   
            case "e":
            case "i": 
            case "o":
            case "u":
            case "A":   
            case "E":
            case "I": 
            case "O":
            case "U": System.out.println("É uma vogal");break; 
            default: System.out.println("É uma consoante"); 
        }
            }
      
    }
}
