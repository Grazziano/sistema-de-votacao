package com.betrybe.sistemadevotacao;

/**
 * Classe para objetos do tipo PessoaEleitora.
 *
 * @author Grazziano Fagundes
 */
public class PessoaEleitora extends Pessoa {

  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    super.setNome(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
