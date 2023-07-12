package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import br.autenticacao.model.Pessoa;

import java.util.Collections;
import java.util.List;

public class ListarPessoasService {

    private GravarPessoaRepository repository;

    public List<Pessoa> executar() {
        return Collections.emptyList();
    }
}
