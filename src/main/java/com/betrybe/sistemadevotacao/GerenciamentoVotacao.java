package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe para objetos do tipo GerenciamentoVotacao.
 *
 * @author Grazziano Fagundes
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  public ArrayList<PessoaCandidata> getPessoasCandidatas() {
    return pessoasCandidatas;
  }

  public ArrayList<PessoaEleitora> getPessoasEleitoras() {
    return pessoasEleitoras;
  }

  public ArrayList<String> getCpfsComputados() {
    return cpfsComputados;
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    PessoaCandidata pessoa = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoa);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.size(); i++) {
      if (pessoasEleitoras.get(i).getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    PessoaEleitora pessoa = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoa);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
