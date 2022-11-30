
package com.loiane.cursojava.aula13.classes;


    /*
Relacionamento entre classes. Declaração de classe dentro de outra classe.
Array, (vetor) de de clsses
*/


public class Contato {
       
        private String  nome;
        private Endereco  endereco;
        private Telefone  telefone;
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
