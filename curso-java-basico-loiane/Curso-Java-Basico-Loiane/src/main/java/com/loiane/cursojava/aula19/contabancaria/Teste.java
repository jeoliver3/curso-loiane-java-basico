
package com.loiane.cursojava.aula19.contabancaria;


public class Teste {
    
    public static void main(String[] args) 
    {
        
        System.out.println("*****Teste ContaBancaria ******");
        
        ContaBancaria contaSimples = new ContaBancaria();
        
        
        contaSimples.setNomeCliente("Jessy");
        contaSimples.setNumConta("00.000.00");
        System.out.println(contaSimples);
        
        //Depositando 100,00
        contaSimples.depositar(100);
        System.out.println("Deposito efetuado. Seu saldo é de  " +contaSimples.getSaldo());
        
        //Sacar valor
        realizarSaque(contaSimples,40);
        realizarSaque(contaSimples,70);
        
        
        
        System.out.println("****Conta Poupanca *****");
        
        ContaPoupanca contaPoupanca = new  ContaPoupanca();
        
        contaPoupanca.setNomeCliente("jessy");
        contaPoupanca.setNumConta("111.111.111");
        System.out.println(contaPoupanca);
        
        contaPoupanca.setDiaRendimento(22);
        
        contaPoupanca.depositar(100);
        System.out.println("Deposito efetuado. Seu saldo é de  " +contaPoupanca.getSaldo());
        
        realizarSaque(contaPoupanca,40);
        realizarSaque(contaPoupanca,70);
        
        if(contaPoupanca.calcularNovoSaldo(0.5))
        {
            System.out.println("Novo saldo de rendimento aplicado: " +contaPoupanca.getSaldo());
        }
        else
        {
            System.out.println("Hoje não é dia de rendimento");
        }
        
        System.out.println("********Conta Especial******");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        
        contaEspecial.setNomeCliente("jessy");
        contaEspecial.setNumConta("222.222.222.");
        contaEspecial.setLimite(60);
        
        System.out.println(contaEspecial);
        
        contaEspecial.depositar(100);
        
        System.out.println("Deposito efetuado. Seu saldo é de  " +contaEspecial.getSaldo());
        
        
        realizarSaque(contaEspecial,50);
        
    }
    
    //Método criado para ficar mais fácil entendimento do código
    private static void realizarSaque(ContaBancaria conta, double valor)
    {
        if(conta.sacar(valor))
        {
            System.out.println("Saque efetuado com sucesso. Novo saldo = " + conta.getSaldo());
        }
        else
        {
            System.out.println(" Saldo insuficiente para saque de " +valor+ " Seu saldo de " +conta.getSaldo());
        }
       
        
    }
}
