package br.autenticacao;

import br.autenticacao.controller.command.ManterPessoaCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        ManterPessoaCommand command = new ManterPessoaCommand();
//        command.executar();
    }

}
