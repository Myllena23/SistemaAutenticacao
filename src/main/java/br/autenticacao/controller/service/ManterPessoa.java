package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import br.autenticacao.view.LerPessoa;
import br.autenticacao.model.Pessoa;

public class ManterPessoa {

    private GravarPessoaRepository repository;

    public void manter() {
        var pessoa = new LerPessoa();
        Pessoa pessoaInformada = pessoa.criarPessoa();

        repository = new GravarPessoaRepository();
        var identificacaoPessoa = repository.gravarPessoa(pessoaInformada);

        var pessoaRecuperada = repository.recuperarPessoa(identificacaoPessoa);

        System.out.println("Pessoa salva: " + pessoaRecuperada.toString());

        System.out.println("Obrigado!");
    }

}
