
package com.loiane.cursojava.aula11.encapsulamento;

/*
Se em uma classe temos atributos privados, devemos nessa mesma classe criar métodos getters e setters públicos para obter um valor ou para atribuir um valor.
Com get vamos obter vamos obter um valor. Método com retorno.
Com set vamos estar, atribuir um valor aos atributos Método (void )sem retorno.
Esse conceito em OO , de não expor diretamente os atributos para manipulação, é chamado de Encapsulamento.
Setar seus atributos como private e criar métodos get/set para cada atributo desses.

*/

public class Carro {
    private String  marca;
    private String  modelo;
    private int     numPassageiros;
    private double  capacidadeCombustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }
}
