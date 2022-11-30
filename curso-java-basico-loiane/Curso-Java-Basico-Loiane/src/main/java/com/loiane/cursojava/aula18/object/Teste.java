
package com.loiane.cursojava.aula18.object;


public class Teste {
    
     public static void main(String[] args) {

        
        
        Aluno aluno = new Aluno();
        
        aluno.setCursos("Engenharia de Software");
        double[] notas = {3,7,5};
        aluno.setNotas(notas);
        
        
        System.out.println(aluno.toString());
    }
    
}
