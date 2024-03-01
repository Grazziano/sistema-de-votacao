package com.betrybe.sistemadevotacao;

/**
 * Classe para objetos do tipo PessoaCandidata, onde serão contidos, valores e métodos para o
 * mesmo.
 *
 * @author Grazziano Fagundes
 */
public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  /**
   * {@summary <p> constructor. <p/>}
   *
   * @param nome   string
   * @param numero integer
   */
  public PessoaCandidata(String nome, int numero) {
    super.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
