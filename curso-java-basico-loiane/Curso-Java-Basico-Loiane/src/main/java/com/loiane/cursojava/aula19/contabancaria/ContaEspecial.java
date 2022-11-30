
package com.loiane.cursojava.aula19.contabancaria;


public class ContaEspecial extends ContaBancaria {
 
    private double limite;
   

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "";
        s+= "Limite " + limite +"\n";
        s+= super.toString();
        return s;
          
    }
    
    //Valor do saque precisa ser o valor do limite + o valor do saldo
    
    public boolean sacar(double valor)
    {
        double saldoComLimite = (this.getSaldo() + limite);
        
        if((saldoComLimite - valor) >= 0)
        {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
