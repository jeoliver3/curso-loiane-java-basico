
package com.loiane.cursojava.aula13.classes;

/*
Declarar classe Telefone, com atributos, (Relacionamento tem um), que ao inves 
desses atributos terem um tipo de dado, serão do tipo telefone.
*/

public class Telefone {
     private String tipo;
    private String ddd;
    private String numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
