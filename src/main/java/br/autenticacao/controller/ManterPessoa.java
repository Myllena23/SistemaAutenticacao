package br.autenticacao.controller;

import br.autenticacao.view.LerPessoa;
import br.autenticacao.model.Pessoa;

public class ManterPessoa {

    public void manter() {
        LerPessoa pessoa = new LerPessoa();
        Pessoa pessoaInformada = pessoa.criarPessoa();

        System.out.println("Obrigado!");
    }

}
