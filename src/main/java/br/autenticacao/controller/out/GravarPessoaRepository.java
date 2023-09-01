package br.autenticacao.controller.out;

import br.autenticacao.model.Pessoa;
import br.autenticacao.model.PessoaEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class GravarPessoaRepository {

    private PessoaJpaRepository pessoaJpaRepository;


    //  List<Pessoa> pessoasSalvas = new ArrayList<>();
    public Long gravarPessoa(Pessoa pessoa){
        PessoaEntity pessoaEntity = PessoaEntity.builder()
                .nome(pessoa.getNome())
                .cpf(pessoa.getCpf())
                .email(pessoa.getEmail())
                .build();
        pessoaJpaRepository.save(pessoaEntity);
        return pessoaEntity.getId();

    }


//    public Integer gravarPessoa(Pessoa pessoa) {
//        pessoasSalvas.add(pessoa);
//        return Pessoa.identificacao;
//    }

//    public Pessoa recuperarPessoa(Integer identificador) {
//        return pessoasSalvas.get(identificador);
//    }
//
//    public List<Pessoa> listarTodasPessoas() {
//        return pessoasSalvas;
//    }

    public void excluirPessoa(Integer identificador) {

    }

}