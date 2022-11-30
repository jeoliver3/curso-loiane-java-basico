
package com.loiane.cursojava.aula09.poo;


public class TesteCarro {
     public static void main(String[] args) {

        Carro  van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 4;
        van.capacidadeCombustivel = 0.2;

        System.out.println("Marca : " +van.marca);
        System.out.println("Modelo : "+ van.modelo);
        System.out.println("Limite de passageiros: "+ van.numPassageiros);
        System.out.println("Capacidade de combustível :" +van.capacidadeCombustivel);
        
        Carro fusca = new Carro();
        
        fusca.marca = "VolksWagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 3;
        fusca.capacidadeCombustivel = 0.5;
        
        System.out.println("Marca : " +fusca.marca);
        System.out.println("Modelo : "+ fusca.modelo);
        System.out.println("Limite de passageiros: "+ fusca.numPassageiros);
        System.out.println("Capacidade de combustível :" +fusca.capacidadeCombustivel);
    }
}
