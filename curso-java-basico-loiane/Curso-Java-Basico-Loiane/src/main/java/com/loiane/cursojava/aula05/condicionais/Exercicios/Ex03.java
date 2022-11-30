
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
          //Verficar  letra do input
          
        /*Utilizando String não se usa operador de comparação. Usa-se
         equalsIgnoreCase para ignorar 
          o case sensitive, no output vai executar
         letras maiusculas e minusculas*/
        
        System.out.println("Digite F ou M: ");
        String letra = input.next();
        
        if(letra.equalsIgnoreCase ("F"))
        {
            System.out.println("Feminino");
        }
        else if(letra.equalsIgnoreCase ("M"))
        {
            System.out.println("Masculino");
        }
        else
        {
            System.out.println("Sexo inválido");
        }

    }    
}
