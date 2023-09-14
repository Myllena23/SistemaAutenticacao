package br.autenticacao;

import br.autenticacao.controller.command.ManterPessoaCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

//        ApplicationContext applicationContext =
//                SpringApplication.run(Main.class, args);
//        ManterPessoaCommand command = applicationContext.getBean(ManterPessoaCommand.class);
//        command.executar();
    }

}
