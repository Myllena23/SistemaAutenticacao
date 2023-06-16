package model;

import java.util.UUID;

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

    public UUID getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(UUID identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
