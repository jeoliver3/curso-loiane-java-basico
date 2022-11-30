
package com.loiane.cursojava.aula09.poo.metodos.sobrecarga;


public class Teste {
    public static void main(String[]args)
    {
        MinhaCalculadora calculadora = new MinhaCalculadora();
        
        System.out.println(calculadora.somar(5, 5));
        System.out.println(calculadora.somar(2.5, 2.5, 2.5));
        
    }
}
