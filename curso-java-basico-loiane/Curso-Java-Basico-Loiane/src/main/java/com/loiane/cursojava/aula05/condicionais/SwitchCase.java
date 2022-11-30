
package com.loiane.cursojava.aula05.condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        // 1a exemplo
        System.out.println("Digite um dia da semana de 1 a 7: ");
        int diaSemana = input.nextInt();
        switch(diaSemana)
        {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira");break;
            case 3: System.out.println("Terça-feira");break;
            case 4: System.out.println("Quarta-feira");break;
            case 5: System.out.println("Quinta-feira");break;
            case 6: System.out.println("Sexta-feira");break;
            case 7: System.out.println("Sábado");break;
            default: System.out.println("Não é um dia válido");
        
        }
 
        // 2a exemplo break funciona como parada de execução do bloco
        
        System.out.println("Digite um dia da semana de 1 a 7: ");
        int diaSemana2 = input.nextInt();
        switch(diaSemana2)
        { 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Dia útil");break;
            case 1:
            case 7: System.out.println("Fim de semana");break;
            default: System.out.println("Não é um dia válido");
        
        }
        
    }
}
