
package com.loiane.cursojava.aula09.poo.metodos;


public class Carro2 {
    
    String  marca;
    String  modelo;
    int     numPassageiros;
    double  capacidadeCombustivel;
    double  consumo;
    
    //Metodo com retorno
    
    double obterAutonomia()
    {
        System.out.println("Metodo obterAutonomia foi chamado");
        return capacidadeCombustivel * consumo;
    }
}
