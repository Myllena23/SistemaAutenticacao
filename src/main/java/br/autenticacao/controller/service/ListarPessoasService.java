package br.autenticacao.controller.service;

import br.autenticacao.controller.out.GravarPessoaRepository;
import br.autenticacao.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ListarPessoasService {

    private GravarPessoaRepository repository;

    public List<Pessoa> executar() {
        return Collections.emptyList();
    }
}
