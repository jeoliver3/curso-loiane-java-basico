
package com.loiane.cursojava.aula20.inter;

/*
Conceito de interface é que seria uma classe abstrata e que só tem métodos 
abstratos dentro dessa classe. Os atributos dentro de uma interface são 
constantes, são declarados como public final, mas não é necessário add pois
o fato de implementar, atraves do operador implements, já deixa claro isso.
Métodos em uma interface,por padrão já são publicos e abstratos, por isso não
é necessário quando for declarar métodos.
Comportamentos que podem ser implementados nas classes cavalo, gato e cachorro,
atraves do operador implements, passam a ser interfaces, adiconando a palavra 
chave interface no lugar de abstract class, já que não podemos 
estender de classes como Mamifero, porque nem todo mamifero é um animal de esti-
mação, nem possui comportamentos como brincar e levar para paessear.
*/

public interface AnimalEstimacao {
    
    // Comportamentos que podem ser implementados nas classes cachorro e gato
     void brincar();
     void levarPassear();
}
