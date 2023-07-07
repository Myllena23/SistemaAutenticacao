package br.autenticacao.view;

import br.autenticacao.model.Pessoa;

import java.util.Scanner;

public class OperacoesPessoa {

    public Integer exibeMenuInicial() {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Escolha a opção desejada digitando o número:\n");
        System.out.println("1 - Para realizar o seu cadastro.\n");
        System.out.println("2 - Para realizar o login.\n");
        System.out.println("3 - Para recuperar todos os usuários cadastrados.\n");
        System.out.println("4 - Para excluir um usuário cadastrado.\n");
        return in.nextInt();
    }

    public Pessoa criarPessoa() {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! \nDigite o seu nome: ");
        String nomePessoa = in.nextLine();
        System.out.println("Digite o seu e-mail: ");
        String emailPessoa = in.nextLine();
        System.out.println("Digite o seu cpf: ");
        String cpfPessoa = in.nextLine();
        return new Pessoa(nomePessoa, emailPessoa, cpfPessoa);
    }

}
