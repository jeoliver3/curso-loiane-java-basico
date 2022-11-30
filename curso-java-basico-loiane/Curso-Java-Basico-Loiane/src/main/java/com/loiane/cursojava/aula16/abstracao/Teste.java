
package com.loiane.cursojava.aula16.abstracao;

/*
Conceito de Classe Abstrata no Java:
Com o operador abstract , na declaração da classe , não pode ser instanciada, 
pois não podemos ter algo real dessa classe.
mas pode ser estendidas por outras subclasses. E essas subclasses podem ser
isntanciadas.

*/
public class Teste {
    
    public static void main(String[] args) {
       
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();
        
        aluno.setEndereco("Rua 2 num 2");
        prof.setEndereco("Rua 3 num 3 ");
        
        /*Exemplo de Polimorfismo (Em tempo de execução).Chamando métodos com 
        as mesmas assinaturas. Conceito de abstração: Você apenas define, não
        pode tornar realidade. A classe ou o método. E nas classes filhas, 
        precisam declarar esses métodos*/
        
        aluno.imprimirEtiquetaEndereco();
        prof.imprimirEtiquetaEndereco();
    }
    
}
