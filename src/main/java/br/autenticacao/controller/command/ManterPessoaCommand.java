package br.autenticacao.controller.command;

import br.autenticacao.controller.service.CadastrarPessoaService;
import br.autenticacao.controller.service.ExcluirPessoaService;
import br.autenticacao.controller.service.ListarPessoasService;
import br.autenticacao.controller.service.LogarPessoaService;
import br.autenticacao.view.OperacoesPessoa;

public class ManterPessoaCommand {

    private CadastrarPessoaService cadastrarPessoa;
    private ExcluirPessoaService excluirPessoa;
    private ListarPessoasService listarPessoa;
    private LogarPessoaService logarPessoa;

    public void executar() {
        OperacoesPessoa operacoes = new OperacoesPessoa();
        Integer opcaoEscolhida = operacoes.exibeMenuInicial();

        validaOpcaoEscolhida(opcaoEscolhida);

        switch (opcaoEscolhida) {
            case 1 -> {
                cadastrarPessoa = new CadastrarPessoaService();
                cadastrarPessoa.executar();
            }
            case 2 -> {
                logarPessoa = new LogarPessoaService();
                logarPessoa.executar();
            }
            case 3 -> {
                listarPessoa = new ListarPessoasService();
                listarPessoa.executar();
            }
            case 4 -> {
                excluirPessoa = new ExcluirPessoaService();
                excluirPessoa.executar();
            }
        }
    }

    private void validaOpcaoEscolhida(Integer opcaoEscolhida) {

    }
}
