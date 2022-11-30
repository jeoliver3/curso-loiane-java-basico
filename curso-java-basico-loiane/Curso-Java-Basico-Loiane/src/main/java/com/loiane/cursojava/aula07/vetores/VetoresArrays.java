
package com.loiane.cursojava.aula07.vetores;

public class VetoresArrays {
    public static void main(String[] args)
    {
        /*
        Como armazenar a temperatura média diária no período de 1 ano, utilizando vetores
        */
       
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        System.out.println("Valor da temperatura do 3o dia  é: "  + temperaturas[2] );
        System.out.println("Tamanho do array é :  "  + temperaturas.length ); // faz a contagem das posições que foram setadas.
        
        for(int i = 0; i < temperaturas.length; i++) // for faz a iteraçnao do array.
            //índice percorre o vetor desde o 0,  entra na condição e incrementa.
        {
             System.out.println("O valor da temperatura do dia " + (i+1) +  " é: " + temperaturas[i]);
             // traz índice acrescido de mais 1 e o valor do índice percorrido no vetor
        }
        
        /*
        for melhorado. Faz a iteração no vetor mas traz apenas o valor e não a posição.
        */
        for(double temp: temperaturas )
        {
            System.out.println(temp);
        }
       
    }
}
