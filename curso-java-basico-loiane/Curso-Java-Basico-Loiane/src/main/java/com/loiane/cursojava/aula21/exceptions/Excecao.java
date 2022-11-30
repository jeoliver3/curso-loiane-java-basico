
package com.loiane.cursojava.aula21.exceptions;



public class Excecao {
    
     public static void main(String[]args){
    
    
        int[] vetor = new int[4];
        System.out.println("Antes da exception");
        
        //vai dar erro com a mensagem: ArrayIndexOutOfBoundsException, ou seja,
        //Tentando acessar uma posição do array que não existe, pois temos 
        //apenas 4 posições no array (0,1,2,3). E acessar 4 seria tentar a 
        //posição 5 do vetor.
        
        
        vetor[4] = 1;
        System.out.println("Esse texto não será impresso");
        
    
    
    }
}
