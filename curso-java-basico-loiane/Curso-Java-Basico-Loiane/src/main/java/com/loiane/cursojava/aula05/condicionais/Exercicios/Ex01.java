
package com.loiane.cursojava.aula05.condicionais.Exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

          // mostrando o maior valor
        
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        
        if(num1 > num2)
        {
            System.out.println("Num1 é o maior número");
        }
        else if(num1 == num2)
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("Num2 é o maior número");
        }
    }
}
