package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 *
 * @author Grazziano Fagundes
 */
public class Principal {

  /**
   * main class.
   *
   * @param args metodo principal
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    int opcaoCandidata;
    int opcaoEleitora;
    int opcaoVoto;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcaoCandidata = Integer.parseInt(scanner.nextLine());

      if (opcaoCandidata == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }

    } while (opcaoCandidata < 2);

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcaoEleitora = Integer.parseInt(scanner.nextLine());

      if (opcaoEleitora == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }

    } while (opcaoEleitora < 2);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcaoVoto = Integer.parseInt(scanner.nextLine());

      if (opcaoVoto == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.votar(cpf, numero);
      } else {
        gerenciamentoVotacao.mostrarResultado();
      }

    } while (opcaoVoto < 3);

    scanner.close();
  }

}
