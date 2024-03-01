package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata para objetos do tipo Pessoa.
 *
 * @author Grazziano Fagundes
 */
public abstract class Pessoa {

  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
