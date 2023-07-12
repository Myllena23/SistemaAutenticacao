package br.autenticacao.controller.out;

import br.autenticacao.model.Pessoa;

import java.util.*;

public class GravarPessoaRepository {

    List<Pessoa> pessoasSalvas = new ArrayList<>();

    public Integer gravarPessoa(Pessoa pessoa) {
        pessoasSalvas.add(pessoa);
        return Pessoa.identificacao;
    }

    public Pessoa recuperarPessoa(Integer identificador) {
        return pessoasSalvas.get(identificador);
    }

    public List<Pessoa> listarTodasPessoas() {
        return pessoasSalvas;
    }

    public void excluirPessoa(Integer identificador) {

    }

}
