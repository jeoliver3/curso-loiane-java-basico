
package com.loiane.cursojava.aula04.operadores;

/**
 *
 * @author bella
 */
public class OperadoresJava {
    public static void main(String[] args)
    {
        int resultado = 1+2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);
        
        // incremento e decremento
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        System.out.println(resultado++);
        // o incremento no final recebe variavel + 1 
        // resultado = resultado + 1
        
        System.out.println(++resultado);
        // o incremento antes, primeiro adicona o valor depois executa variavel
        
        
        //decremento
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
          
        String  primeiroNome ="Esta é ";
        String  segundoNome = "uma String concatenada";
        String  terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        int z = 10, w=5, a=5;
        // z vai receber primeiro o valor de w e w vai ser incrementado
        z = w++;
        System.out.println("z = " +z);
        System.out.println("w = " +w);
        
        // já z recebe de cara o decremento, pois o operador está antes
        z = --a;
        System.out.println("z = " + z);
        System.out.println("a = " + a);
        
    }
}
