
package com.loiane.cursojava.aula13.classes;

/*
Declarar classe Endereco, com atributos, (Relacionamento tem um), que ao inves 
desses atributos terem um tipo de dado, serão do tipo endereço.
*/

public class Endereco {
     
    private String nomeRua;
    private String complemento;
    private String cidade;
    private String estado;
    private String numero;
    private String cep;

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
