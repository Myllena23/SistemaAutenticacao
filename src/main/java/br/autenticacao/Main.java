package br.autenticacao;

import br.autenticacao.controller.service.ManterPessoa;

public class Main {

    public static void main(String[] args) {
        ManterPessoa pessoa = new ManterPessoa();
        pessoa.manter();
    }

}
