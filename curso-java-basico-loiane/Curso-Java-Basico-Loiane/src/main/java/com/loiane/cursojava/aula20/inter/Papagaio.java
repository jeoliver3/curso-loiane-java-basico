
package com.loiane.cursojava.aula20.inter;

/*
   Dentro dessa hierarquia, classes papagaio, cachorro e gato, por não serem
   abstract, precisam implementar, pois são classes concretas.No caso de 
   papagaio,
   é necessário estender métodos de Ave e Animal, já que papagaio é uma ave e um
   animal.

*/

public class Papagaio extends Ave {
    
    @Override
    public void voar() {
    }

    @Override
    public void emitirSom() {
    }
}
