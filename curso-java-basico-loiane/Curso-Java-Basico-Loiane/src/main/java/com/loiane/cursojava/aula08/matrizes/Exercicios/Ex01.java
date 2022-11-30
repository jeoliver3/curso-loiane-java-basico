package com.loiane.cursojava.aula08.matrizes.Exercicios;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {
        /*
            Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz
            e a sua posição (linha, coluna). Para gerar números aleatórios vamos utilizar a classe Random, que faz parte do pacote 
            import java.util.Random.
            Em matriz, com o laço for vamos usar 2 índices para percorrer, array de arrays (i e j). Enquanto i faz iteração das linhas,
            j recebe i fazendo a mesma iteração, mas para coluna.
         */

        int[][] numerosAleatorios = new int[4][4]; // declarando a matriz

        Random numeroRandom = new Random(); //variavel numeroRandom 

        for (int i = 0; i < numerosAleatorios.length; i++)// fazendo iteração na matriz
        {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100); // numeros aleatorios até 100
            }
        }

        int maior = 0;
        int row = 0;
        int colum = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    row = i;
                    colum = j;
                }

                System.out.print(numerosAleatorios[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("Maior valor = " + maior);
        System.out.println("linha = " + row);
        System.out.println("posição  = " + colum);

    }
}
