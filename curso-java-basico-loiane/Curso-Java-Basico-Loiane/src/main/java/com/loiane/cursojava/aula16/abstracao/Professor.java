
package com.loiane.cursojava.aula16.abstracao;


public class Professor extends Pessoa {
    
    String departamento;
    String nomeCurso;
    double salario;
    
    public double calcularSalarioLiquido()
    {
        return 0;
    }

   public String obterEtiquetaEndereco()
   {
       String s = "Endereço do professor: ";
       s+= super.getEndereco();
       return s;
   } 

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
    
}
