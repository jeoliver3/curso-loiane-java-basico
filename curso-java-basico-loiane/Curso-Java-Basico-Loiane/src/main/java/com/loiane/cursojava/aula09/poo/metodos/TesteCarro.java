
package com.loiane.cursojava.aula09.poo.metodos;


public class TesteCarro {
    public static void main(String[] args) {
        
        Carro  van = new Carro();
        
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 4;
        van.capacidadeCombustivel = 0.2;
        van.consumo = 2.0;

        System.out.println("Marca : " +van.marca);
        System.out.println("Modelo : "+ van.modelo);
        
        van.exibirAutonomia();
    
}
}
