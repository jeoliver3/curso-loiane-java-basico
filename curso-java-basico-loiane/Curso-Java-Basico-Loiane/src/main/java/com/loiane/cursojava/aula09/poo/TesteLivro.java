
package com.loiane.cursojava.aula09.poo;


public class TesteLivro {
    
     public static void main(String[]args)
    {
        
        Livro livro = new Livro();
        
        livro.nome = "Estruturas de Dados e Algoritmos com JavaScript";
        livro.autor = "Loiane Groner";
        livro.qtdadePaginas = 408;
        livro.anoLancamento = 2019;
        
        System.out.println("Nome do livro: " +livro.nome);
        System.out.println("Nome do autor: " +livro.autor);
        System.out.println("Quantidade de páginas: " +livro.qtdadePaginas);
        System.out.println("Ano de lançamento: " +livro.anoLancamento);
    }
}
