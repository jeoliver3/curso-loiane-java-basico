
package com.loiane.cursojava.aula09.poo;

public class TesteLampada {
    
    public static void main(String[]args)
    {
        Lampada lampada = new Lampada();
        
        lampada.modelo = "globo";
        lampada.potencia = 2.5;
        lampada.tipoAbajour = false;
        lampada.garantiaMeses = 36;
        lampada.cor = "amarela";
        lampada.voltagem = "127/220v";
        
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Bulbo";
        lampada.tipos[1] = "Globo";
        lampada.tipos[2] = "Ball";
        lampada.tipos[3] = "bolinha";
    
    }
}
