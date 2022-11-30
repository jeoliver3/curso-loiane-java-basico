
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex07 {
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
           // verificar turno
        
        System.out.println("Digite M matutino, V para vespertino ou N noturno");
        char    turno = input.next().charAt(0);
        
        if(turno == 'M')
        {
            System.out.println("Bom dia");
        }
        else if(turno == 'V')
        {
            System.out.println("Boa tarde");
        }
        else if(turno == 'N')
        {
            System.out.println("Boa noite");
        }
        else
        {
            System.out.println("Valor inválido");
        }
    
    
    }
}
