
package com.loiane.cursojava.aula20.inter;

/*
   Dentro dessa hierarquia, classes papagaio, cachorro e gato, por não serem
   abstract, precisam implementar, pois são classes concretas.No caso de 
   cachorro, é necessário estender métodos de Mamifero e Animal, já que cachorro
   é um mamifero e um animal.
   Cachorro vai implementar AnimaEstimacao e AnimalDomestico, seus métodos tb.
*/
public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomestico{
    private int tamanho;
    private String raca;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
    }

    @Override
    public void emitirSom() {
    }

    @Override
    public void levarVeterinario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
    
    
}
