package br.autenticacao.controller.command;

import br.autenticacao.controller.service.CadastrarPessoaService;
import br.autenticacao.controller.service.ExcluirPessoaService;
import br.autenticacao.controller.service.ListarPessoasService;
import br.autenticacao.controller.service.LogarPessoaService;
import br.autenticacao.model.Pessoa;
import br.autenticacao.view.OperacoesPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManterPessoaCommand {

    @Autowired
    private CadastrarPessoaService cadastrarPessoa;
    private ExcluirPessoaService excluirPessoa;
    private ListarPessoasService listarPessoa;
    private LogarPessoaService logarPessoa;

    public void executar() {
        OperacoesPessoa operacoes = new OperacoesPessoa();
        Integer opcaoEscolhida = operacoes.exibeMenuInicial();

        switch (opcaoEscolhida) {
            case 1 -> {
                cadastrarPessoa.executar();
                operacoes.exibeMenuInicial();
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
                listarPessoa = new ListarPessoasService();
                List<Pessoa> pessoas = listarPessoa.executar();
                operacoes.exibePessoasCadastradas(pessoas);
                Integer pessoaSelecionada = operacoes.exibeMenuParaSelecionarPessoaASerExcluida();
                excluirPessoa.executar(pessoaSelecionada);
            }
            case 5 -> { }
        }
    }

}
