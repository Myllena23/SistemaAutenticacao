package br.autenticacao.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Pessoa {

    private UUID identificacao;
    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) {
        this.identificacao = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

}
