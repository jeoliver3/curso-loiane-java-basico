
package com.loiane.cursojava.aula06.loops;


public class WhileDoWhile {
    public static void main(String[] args)
    {
        /*
        while primeiro avalia a expressão se é vdd ou falso e depois executa 
        o bloco de código.
        */
       
        int count = 0;
        int max = 10;
        
        System.out.println("Contando até 10");
       
        while(count <= 10)
        {
            System.out.println(" " + count);
            count++;
        }
        System.out.println(count);
        
        /*
        do while primeiro executa a expressão e depois analisa. Se for falso
        encerra o programa, se for vdd executa até enquanto for vdd. com 
        condição determinada pelo while
        */
        
        do
        {
            count++;
            System.out.println("Valor de count é : " + count);
        }
        while(count < 13);
        
        System.out.println(count);

        
    }
}
