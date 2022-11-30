
package com.loiane.cursojava.aula06.loops.Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        /*
        Lendo e validando infos do usuário
        */
        
        boolean infoValida = false;
        String  name;
        int idade;
        
        
        do
        {
            System.out.println("Digite o nome: ");
            name = input.nextLine();
            
            if(name.length() >= 3) // length para contar caracteres
            {
                infoValida = true;
            } 
            else
            {
                System.out.println("Nome precisa ter minímo 3 caracteres");
            }
        }
            while(!infoValida);
        
        
        infoValida = false; // reutilizando variável no código
    
        do
        {
            System.out.println("Digite a idade: ");
            idade = input.nextInt();
            
            if(idade >= 0 && idade <= 150) 
            {
                infoValida = true;
            } 
            else
            {
                System.out.println("Idade precisa ser entre 0 e 150 anos ");
            }
        }
            while(!infoValida);
        
        
        infoValida = false; // reutilizando variável no código
        double salario;
        
        do
        {
            System.out.println("Digite o salário: ");
            salario = input.nextDouble();
            
            if(salario >  0) 
            {
                infoValida = true;
            } 
            else
            {
                System.out.println("Salario  precisa ser maior que 0 ");
            }
        }
            while(!infoValida);
        
        
        infoValida = false; // reutilizando variável no código
        String  genero;
        
        do
        {
            System.out.println("Digite o genero: ");
            genero = input.nextLine();
            
            if(genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) 
            {
                infoValida = true;
            } 
            else
            {
                System.out.println("Gênero precisa  ser m ou f");
            }
        }
            while(!infoValida);
        
        
        
        infoValida = false; // reutilizando variável no código
        String  estadoCivil;
        
        
        do
        {
            System.out.println("Digite o estado civil- s, c, v ou d ");
            estadoCivil = input.nextLine();
            
            if
       (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")||
        estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")            ) 
            {
                infoValida = true;
            } 
            else
            {
                System.out.println("Digite apenas 's', 'c', 'v' ou 'd' ");
            }
        }
            while(!infoValida);
        
            System.out.println("Informações do usuário são: ");
            
            /*
            System.out.println("" + name);
            System.out.println("" + idade);
            System.out.println("" + salario);
            System.out.println("" + genero);
            System.out.println("" + estadoCivil);
            */                 
            
            System.out.println
            (" " + name +" " + idade + " " + salario + " " + genero + " "+ 
                    estadoCivil);
            
    } 
}
