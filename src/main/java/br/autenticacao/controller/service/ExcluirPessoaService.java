package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExcluirPessoaService {

    private GravarPessoaRepository repository;

    public void executar(Integer pessoa) {
        repository = new GravarPessoaRepository();
        repository.excluirPessoa(pessoa);


    }
}
