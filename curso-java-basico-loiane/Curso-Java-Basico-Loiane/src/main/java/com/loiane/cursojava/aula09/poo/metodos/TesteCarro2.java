
package com.loiane.cursojava.aula09.poo.metodos;


public class TesteCarro2 {
     public static void main(String[]args)
    {
        Carro2  van = new Carro2();
        
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 4;
        van.capacidadeCombustivel = 0.2;
        van.consumo = 2.0;

        System.out.println("Marca : " +van.marca);
        System.out.println("Modelo : "+ van.modelo);
    
        /*duas formas de imprimir o método, criando uma variável e atribuindo 
        o método a ela ou chamando o método no output*/
        
        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é: " +autonomia);
        System.out.println("Autonomia do carro é: " + van.obterAutonomia());
    
    }
}
