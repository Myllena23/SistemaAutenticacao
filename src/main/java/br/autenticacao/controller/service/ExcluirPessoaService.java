package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;

public class ExcluirPessoaService {

    private GravarPessoaRepository repository;

    public void executar(Integer pessoa) {
        repository = new GravarPessoaRepository();
        repository.excluirPessoa(pessoa);


    }
}