
package com.loiane.cursojava.aula04.operadores;

/**
 *
 * @author bella
 */
public class OperadoresLogicos {
    public static void main(String[] args)
  {
     int valor1 = 1;
     int valor2 = 2;
     
     boolean resultado1 = (valor1 == 1) && (valor2 == 2);
     System.out.println("valor1 é igual a 1 e valor2 é igual a 2: " + resultado1);
        
     boolean resultado2 = (valor1 == 1) || (valor2 == 2);
     System.out.println("valor1 é igual a 1 e valor2 é igual a 2: " + resultado2);
    
     boolean verdadeiro = true;
     boolean falso = false;
     
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso); /*shor, única condição para dar
        falso é vdd com vdd ou falso com falso*/
        System.out.println(!verdadeiro && falso);/*verdadeiro sendo negado, dá
        falso */ 

  
   }
}
