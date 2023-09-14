package br.autenticacao.view;

import br.autenticacao.controller.service.CadastrarPessoaService;
import br.autenticacao.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AutenticacaoController {
    private final CadastrarPessoaService cadastrarPessoaService;

    @PostMapping("criar")
    public ResponseEntity<Object> criarPessoa(@RequestBody Pessoa pessoa){
        cadastrarPessoaService.executar(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pessoa criada");
    }

}
