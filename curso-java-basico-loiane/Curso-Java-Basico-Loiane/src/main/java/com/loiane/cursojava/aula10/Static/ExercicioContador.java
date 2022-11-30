
package com.loiane.cursojava.aula10.Static;

/*
Escreva uma classe chamada Contador, que tem um atributo estático que é incremen
tado sempre que a classe for instanciada. Crie métodos para zerar, incrementar
e retornar o valor do contador.Desenvolva um programa para testar essa classe.
*/


public class ExercicioContador {
    static int count; // por padrão variável sem valor é zero.
    
    //método para incrementar
    public static void incrementar()
    {
        count++;
    }
    
    //método para zerar
    public static void zerar()
    {
        count = 0;
    }
    
    //método para obter o valor
    public static int obterValor()
    {
        return count;
    }
}
