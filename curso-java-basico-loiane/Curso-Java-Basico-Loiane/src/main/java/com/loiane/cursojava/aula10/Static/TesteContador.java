
package com.loiane.cursojava.aula10.Static;


public class TesteContador {
     
    public static void main(String[]args)
    {
        System.out.println(ExercicioContador.obterValor());
        
        ExercicioContador.incrementar();
        
        System.out.println(ExercicioContador.obterValor());
        
        ExercicioContador.zerar();
        
        System.out.println(ExercicioContador.obterValor());
        
        ExercicioContador.incrementar();
        ExercicioContador.incrementar();
        ExercicioContador.incrementar();

        System.out.println(ExercicioContador.obterValor());
    }
}
