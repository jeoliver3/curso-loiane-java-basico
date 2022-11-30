
package com.loiane.cursojava.aula12.recursividade;

/*
Método recursivo: método que chama ele mesmo. 
Preciso de um ponto de parada, para que não caia em um looping infinito.
Métodos recursivos são utilizados em estrutura de dados pilha.
*/

public class CalculaFatorial {
    //Método não recursivo
        public static int calculaFatorial(int num)
        {
            int total = 1;
            
            for(int i = num; i > 1; i--)
            {
                total*= i;
            }
            return total;
        }  
        
        //Método recursivo
        public static int fatorial(int num)
       
        {
            if(num==0)
            {
                return 1; // ponto de parada
            }
            return num * fatorial(num-1);
        }
}
