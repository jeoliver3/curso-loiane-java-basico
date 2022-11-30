
package com.loiane.cursojava.aula09.poo.metodos;

public class Carro {
    
    String  marca;
    String  modelo;
    int     numPassageiros;
    double  capacidadeCombustivel;
    double  consumo;
    
  //Metodo  que apenas axibe uma mensagem, não retorna nenhum valor.
    
    void exibirAutonomia()
    {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumo);
    }
}
