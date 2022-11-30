
package com.loiane.cursojava.aula08.matrizes;


public class MatrizNotaAlunos {
    public static void main(String[] args)
        {
            /*
            Matriz - tabela
            Armazenar 4 notas do ano (1 para cada bimestre) de 5 alunos.
            Alunos x Notas.
            Nas linhas ficam os alunos (horizontal). Nas colunas ficam as notas (vertical).
            */
            
        
            double[][]  notaAlunos = new double[5][4];
            
            notaAlunos[0][0] = 10;
            notaAlunos[0][1] = 7;
            notaAlunos[0][2] = 8;
            notaAlunos[0][3] = 9.5;
                    
                    /*for(int i = 0; i < notaAlunos.length; i++) 
                    {
                        for(int j = 0; j < notaAlunos[i].length; j++)
                        {
                            System.out.print(notaAlunos [i] [j] + " " );             
                        }
                            System.out.println();     
                    }*/
                    
            notaAlunos[1][0] = 9;
            notaAlunos[1][1] = 8;
            notaAlunos[1][2] = 7;
            notaAlunos[1][3] = 9;
            
            notaAlunos[2][0] = 8;
            notaAlunos[2][1] = 9;
            notaAlunos[2][2] = 10;
            notaAlunos[2][3] = 7;
            
            notaAlunos[3][0] = 7;
            notaAlunos[3][1] = 10;
            notaAlunos[3][2] = 7.5;
            notaAlunos[3][3] = 8;
            
            notaAlunos[4][0] = 5;
            notaAlunos[4][1] = 8;
            notaAlunos[4][2] = 7;
            notaAlunos[4][3] = 8.5;
                    
                     
            //Apresentando a matriz
            
                    for(int i = 0; i < notaAlunos.length; i++) 
                    {
                        for(int j = 0; j < notaAlunos[i].length; j++)
                        {
                            System.out.print(notaAlunos[i] [j] +" ");             
                        }
                            System.out.println();     
                    }
                    
                   
}
}
