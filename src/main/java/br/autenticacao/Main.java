package br.autenticacao;

import br.autenticacao.controller.command.ManterPessoaCommand;

public class Main {

    public static void main(String[] args) {
        ManterPessoaCommand command = new ManterPessoaCommand();
        command.executar();
    }

}
