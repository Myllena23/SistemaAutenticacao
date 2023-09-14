package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import br.autenticacao.view.OperacoesPessoa;
import br.autenticacao.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarPessoaService {

    @Autowired
    private GravarPessoaRepository repository;

    public void executar(Pessoa pessoa) {
//        var pessoa = new OperacoesPessoa();
//        Pessoa pessoaInformada = pessoa.criarPessoa();

        var identificacaoPessoa = repository.gravarPessoa(pessoa);

        System.out.println("Obrigado!");
    }

}
