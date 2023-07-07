package br.autenticacao.controller.out;

import br.autenticacao.model.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GravarPessoaRepository {

    Map<UUID, Pessoa> pessoasSalvas = new HashMap<>();

    public UUID gravarPessoa(Pessoa pessoa) {
        pessoasSalvas.put(pessoa.getIdentificacao(), pessoa);
        return pessoa.getIdentificacao();
    }

    public Pessoa recuperarPessoa(UUID identificador) {
        return pessoasSalvas.get(identificador);
    }

    public Map<UUID, Pessoa> listarTodasPessoas() {
        return pessoasSalvas;
    }

    public void excluirPessoa(UUID identificador) {

    }

}
