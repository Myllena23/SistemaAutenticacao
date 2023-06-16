package controller;

import model.Pessoa;
import view.LerPessoa;

public class ManterPessoa {

    public void manter() {
        LerPessoa pessoa = new LerPessoa();
        Pessoa pessoaInformada = pessoa.criarPessoa();

        System.out.println("Obrigado!");
    }

}
