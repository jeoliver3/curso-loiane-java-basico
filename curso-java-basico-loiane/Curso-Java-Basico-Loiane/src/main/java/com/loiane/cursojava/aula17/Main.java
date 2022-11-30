/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula17;

/**
 *
 * @author bella
 */
public class Main {
   
    public static void main(String[] args) {
        
        // Como é static posso setar.
        System.out.println(Final.urlBlog);
        
        // Como não é final, posso modificar o valor.
        Final.urlBlog = "http://jessy.com";
        
        // Posso setar 
        System.out.println(Final.URL_CURSO_COMPLETO);
        //Mas não posso modificar valor
        
        //Constantes.URL_CURSO_COMPLETO = "nada";
    }
    
    
}
