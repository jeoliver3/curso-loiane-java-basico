
package com.loiane.cursojava.aula06.loops;

public class LacosRepeticao {
    public static void main(String[]args)
    {
        int[] vetor = new int[4];
        int i = 0;
        
       while(i <= vetor.length)
        {
            System.out.println(i); 
            i++;   
        }
        
        for(i =0; i <= vetor.length; i++)
        {
            System.out.println(i);
        }
    }
}
