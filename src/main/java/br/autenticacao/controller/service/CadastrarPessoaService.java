package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import br.autenticacao.view.OperacoesPessoa;
import br.autenticacao.model.Pessoa;

public class CadastrarPessoaService {

    private GravarPessoaRepository repository;

    public void executar() {
        var pessoa = new OperacoesPessoa();
        Pessoa pessoaInformada = pessoa.criarPessoa();

        repository = new GravarPessoaRepository();
        var identificacaoPessoa = repository.gravarPessoa(pessoaInformada);

//        var pessoaRecuperada = repository.recuperarPessoa(identificacaoPessoa);
//        System.out.println("Pessoa salva: " + pessoaRecuperada.toString());

        System.out.println("Obrigado!");
    }

}
