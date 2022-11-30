
package com.loiane.cursojava.aula13.classes;


public class RelacionamentoTemUm {
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
         contato.setNome("Ana");
        
        //Criando objeto endereco para passar para o set da classe Contato
        
        Endereco end = new Endereco();
        
        end.setNomeRua("Rua Cardeal");
        end.setCep("05415-000");
        end.setCidade("São Paulo");
        end.setNumero("12");
        end.setComplemento("casa 01");
        
        contato.setEndereco(end);
        
        //Criando objeto telefone para passar para o set da classe Contato
        
        Telefone tel = new Telefone();
        
        tel.setTipo("celular");
        tel.setDdd("011");
        tel.setNumero("11-999-999-999");
        
        contato.setTelefone(tel);

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getCidade());
        System.out.println(contato.getTelefone().getDdd());
        
   }
}
