package br.autenticacao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaEntity {

    @Id
    public Long id;
    private String nome;
    private String email;
    private String cpf;

}
