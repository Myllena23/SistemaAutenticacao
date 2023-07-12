package br.autenticacao.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pessoa {

    public static Integer identificacao = 0;
    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) {
        Pessoa.identificacao++;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

}
