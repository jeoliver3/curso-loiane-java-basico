
package com.loiane.cursojava.aula16.abstracao;

public class Aluno extends Pessoa {
    String cursos;
    double notas;
    
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
   public String obterEtiquetaEndereco()
   {
       String s = "Endereço do aluno: ";
       s+= super.getEndereco();
       return s;
   } 
    
    
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
