
package com.loiane.cursojava.aula04.operadores;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args)
    {
        // conversão metro em centímetros
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o metro: ");
        int metro = input.nextInt();
        
        int conversao = metro * 100;
        
        System.out.println("A conversão de metro para centímetros é  :"  
             + conversao);
        
        // Valor do quadrado dobrado
        System.out.println("Digite um número: ");
        int lado1 = input.nextInt();
        System.out.println("Digite outro número: ");
        int lado2 = input.nextInt();
        int somaLados = (lado1 + lado2) * 2;
        
        System.out.println("O valor do quadrado ao dobro  é " + somaLados );
        
        // Horas trabalhadas e valor da hora. Total será o salário.
        
        System.out.println("Digite quanto ganha por hora: ");
        double   valorHora = input.nextDouble();
        System.out.println("Digite quantas horas trabalha por mês: ");
        double   horasTrabalhadas = input.nextDouble();
        double   valorSalario = valorHora * horasTrabalhadas;
        
        System.out.println("Valor do salário mensal é: " + valorSalario );

        System.out.println("Digite um número inteiro: ");
        int num1 = input.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = input.nextInt();
        System.out.println("Digite um número decimal: ");
        double   num3 = input.nextDouble();
        
        double  resultado1 = (num1 * 2) * (num2 / 2);
        double  resultado2 = (num1 * 3) + num3;
        double  resultado3 = Math.pow (num3, 3);
            
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3); 
        

        
        System.out.println("Digite a área a ser pintada: ");
        double  tamanhoArea = input.nextDouble();
        double  ummetro = 333.33;
        double  valorLitro = 4.44;
        double  result;
        double  latas;
        
        result = tamanhoArea * ummetro;
        valorLitro = valorLitro * result;
        latas = result / 18;
        
        System.out.println("Total de latas para comprar é : " + latas);
        System.out.println("Total a pagar é: " + valorLitro);
        
        // Calculando area do quadrado ao dobro
        
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double  lado = input.nextDouble();
        
        // area do quadrado = lado
        double  area = Math.pow (lado, 2);
        /* Math, classe do java que faz o cálculo da potência. Seria lado
        ao quadrado (lado, 2)*/
        
        System.out.println("A área do quadrado é " + area );
        System.out.println("A área do quadrado ao dobro é  " + (area * 2) );
           
    }
   
}
