
package com.loiane.cursojava.aula20.inter;

/*
   Dentro dessa hierarquia, classes papagaio, cachorro e gato, por não serem
   abstract, precisam implementar, pois são classes concretas. No caso de 
   gato, é necessário estender métodos de Mamifero e Animal, já que gato é um 
   mamifero e um animal.
   Gato vai implementar AnimaEstimacao e AnimalDomestico, seus métodos tb.

*/
public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomestico{
 
    private String raca;

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
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
    
}
