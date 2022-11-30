
package com.loiane.cursojava.aula18.object;


import java.util.Arrays;
import java.lang.Object;

public class Aluno {
    
    private String cursos;
    private double[] notas;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    
     
    
     public Aluno(){
        super();
    }
    
     public Aluno(String nome, String endereco, String telefone, String cpf)
    {
        this.cursos = cursos;
        
    }
    
     public double calcularMedia(double num)
    {
        return num;
    }
    
     public boolean verificarAprovado()
    {
        return true;
    }
   
    // Método toString retorna uma string. Pertence a classe Object. Método
     //público e retorna os valores, como nome do curso e notas.
     public String toString()
     {
         String s = cursos + "\n";
         
         
         for(int i = 0; i < notas.length; i++)
         {
             
             s+= Arrays.toString(notas);
         }
          return s;
     } 
     
}
