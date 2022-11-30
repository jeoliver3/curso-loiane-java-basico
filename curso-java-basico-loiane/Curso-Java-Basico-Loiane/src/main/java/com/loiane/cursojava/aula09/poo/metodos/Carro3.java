
package com.loiane.cursojava.aula09.poo.metodos;


public class Carro3 {
      /*Método com parâmetro, usamos quando não temos as informações 
    nos atributos da classe. */
    
    String  marca;
    String  modelo;
    int     numPassageiros;
    double  capacidadeCombustivel;
    double  consumo;
    
    double calcularCombustivel(double km)
    {
        double  qtdadeCombustivel = km / consumo;
        return qtdadeCombustivel;
    }
}
