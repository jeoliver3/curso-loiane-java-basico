
package com.loiane.cursojava.aula19.contabancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    
    
    public boolean calcularNovoSaldo(double taxaRendimento)
    {
        // Vai obter a data de hoje 
        Calendar hoje = Calendar.getInstance();
        //Comparar se dia de rendimebto é igual a dsta de hoje
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))
        {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true; // retirna true se for o dia de rendimento
        }
        return false;
        
    }

    @Override
    public String toString() {
        String s = "";
        s+= " Rendimento " + diaRendimento +"\n";
        s+= super.toString(); // herda da superClasse ContaBancaria
        return s;
        
    }
    
}
