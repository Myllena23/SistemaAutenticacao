package br.autenticacao.view;

import br.autenticacao.model.Pessoa;

import java.util.Scanner;
import java.util.UUID;

public class LerPessoa {

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
