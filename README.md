# Sistema de Votação - Java

Este projeto consiste em desenvolver um sistema de votação simples utilizando a linguagem de programação Java. O objetivo é simular um sistema de cadastro de candidatas(os), eleitoras(es) e realizar o processo de votação. O projeto abrange a manipulação de dados através de listas e oferece uma interface de linha de comando (CLI) para interagir com o sistema.

## Funcionalidades

1. **Cadastro de Candidatos(as):**
   - Adicionar candidatos(as) com nome e número de identificação (ID).
   - Exibir a lista de candidatos(as) cadastrados(as).
   
2. **Cadastro de Eleitores(as):**
   - Adicionar eleitores(as) com nome e título de eleitor.
   - Exibir a lista de eleitores(as) cadastrados(as).

3. **Votação:**
   - Permitir que cada eleitor(a) vote uma única vez.
   - Armazenar os votos de maneira segura e confiável.
   - Exibir o resultado parcial ou final da votação com a contagem de votos para cada candidato(a).

## Requisitos

- Java 8 ou superior.
- Ambiente de desenvolvimento como Eclipse, IntelliJ IDEA ou similar.
- Familiaridade com listas e tratamento de exceções em Java.

## Estrutura de Arquivos

```
/src
  ├── main
  │   ├── Principal.java                      # Classe principal que inicia o sistema.
  │   ├── Pessoa.java                         # Classe abstrata base para Eleitor e Candidato.
  │   ├── PessoaEleitora.java                 # Classe para representar eleitores.
  │   ├── PessoaCandidata.java                # Classe para representar candidatos.
  │   ├── GerenciamentoVotacaoInterface.java  # Classe para representar candidatos.
  │   └── GerenciamentoVotacao.java           # Classe que contém a lógica do sistema.
  └── test
      └── SistemaVotacaoTest.java # Testes unitários para o sistema.
```

## Como Executar

1. Clone o repositório para a sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/sistema-votacao-java.git
   ```
   
2. Abra o projeto no seu ambiente de desenvolvimento Java preferido.

3. Compile e execute a classe `Votacao.java`, que contém o ponto de entrada do programa.

## Exemplo de Uso

Após iniciar o sistema, você será capaz de interagir com as opções apresentadas no terminal:

```
=== Sistema de Votação ===
1. Cadastrar Candidato
2. Cadastrar Eleitor
3. Votar
4. Exibir Resultado
5. Sair
Escolha uma opção: 1
Digite o nome do candidato: João Silva
Digite o ID do candidato: 123
```

O sistema permite navegar por essas opções, gerenciando candidatos, eleitores e a votação.

## Código de Exemplo

Aqui está um exemplo simplificado de como o cadastro de eleitores pode ser implementado:

```java
// Classe Pessoa
public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Eleitor
public class Eleitor extends Pessoa {
    private String tituloEleitor;

    public Eleitor(String nome, String tituloEleitor) {
        super(nome);
        this.tituloEleitor = tituloEleitor;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }
}

// Classe para gerenciamento do sistema
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVotacao {
    private ArrayList<Candidato> candidatos = new ArrayList<>();
    private ArrayList<Eleitor> eleitores = new ArrayList<>();

    // Métodos para cadastrar eleitores, candidatos, votar, e exibir resultados...
}
```

## Melhorias Futuras

- Adicionar suporte a persistência de dados (armazenar em arquivos ou banco de dados).
- Implementar autenticação de eleitor(a) antes da votação.
- Criar uma interface gráfica para facilitar a interação.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Para contribuir, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`).
3. Commit suas alterações (`git commit -m 'Adiciona minha feature'`).
4. Envie para o repositório (`git push origin feature/MinhaFeature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
