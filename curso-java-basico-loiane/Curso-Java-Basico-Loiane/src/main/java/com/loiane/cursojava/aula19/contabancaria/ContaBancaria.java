
package com.loiane.cursojava.aula19.contabancaria;

/*
Exercício:
Encapsular atributos e criar métodos getters e setters.
Criar construtores apropriados e também método toString
*/

public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método toString retorna uma string
    @Override
    public String toString() {
        String s = "";
        s+= "Nome do Cliente " + nomeCliente +"\n";
        s+= "Número da Conta " + numConta;
        return s;
    
    }
    
    /* Conta não pode ficar negativa. Validação com if para saber se o saldo
    menos o valor é maior ou igual a zero, pode realizar um saque. Saldo
    vai ser igual a saldo menos o valor. Então se na validação der vdd no if
    retorna true, senão retorna false, quer dizer q a conta está negativa, pois
    abaixo de 0.
    */
    
    public void depositar(double valor)
    {
        saldo += valor;
    }
    
    
    public boolean sacar(double valor)
    {
        
        if((saldo - valor) >= 0)
        {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
}
