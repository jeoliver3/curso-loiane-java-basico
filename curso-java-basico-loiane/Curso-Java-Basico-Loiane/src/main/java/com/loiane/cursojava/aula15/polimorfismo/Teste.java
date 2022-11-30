
package com.loiane.cursojava.aula15.polimorfismo;


public class Teste {
 
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();
        
        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2 num 2");
        prof.setEndereco("Rua 3 num3 ");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(prof.obterEtiquetaEndereco());
        
    }
       
}
