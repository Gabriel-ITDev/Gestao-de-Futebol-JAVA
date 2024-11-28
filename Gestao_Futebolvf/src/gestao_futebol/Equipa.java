package gestao_futebol; 
// Declara que esta classe faz parte do pacote "gestao_futebol".

import java.util.ArrayList;
import java.util.List;
// Importa as classes ArrayList e List, que serão usadas para armazenar a lista de jogadores.


// Gabriel Alexandre Silva 2023101421
// Comentário indicando o autor da classe.

public class Equipa {
    // Declaração da classe "Equipa", que representa uma equipa de futebol.

    private String treinador;
    // Atributo para armazenar o nome do treinador principal da equipa.

    private String treinadorAdjunto;
    // Atributo para armazenar o nome do treinador adjunto.

    private String delegado;
    // Atributo para armazenar o nome do delegado responsável pela equipa.

    private String divisao;
    // Atributo para armazenar a divisão em que a equipa compete.

    private Clube clube;
    // Atributo que associa a equipa a um clube.

    private String fisio;
    // Atributo para armazenar o nome do fisioterapeuta da equipa.

    private List<Jogador> jogadores;
    // Lista para armazenar os jogadores que fazem parte da equipa.

    // Construtor com todos os parâmetros necessários
    public Equipa(String treinador, String treinadorAdjunto, String delegado, String divisao, Clube clube) {
        this.treinador = treinador;
        // Inicializa o nome do treinador.

        this.treinadorAdjunto = treinadorAdjunto;
        // Inicializa o nome do treinador adjunto.

        this.delegado = delegado;
        // Inicializa o nome do delegado.

        this.divisao = divisao;
        // Inicializa a divisão da equipa.

        this.clube = clube;
        // Associa a equipa ao clube fornecido.

        this.fisio = fisio;
        // Inicializa o nome do fisioterapeuta.

        this.jogadores = new ArrayList<>();
        // Cria uma nova lista vazia para armazenar os jogadores da equipa.
    }

    // Método para adicionar jogador à equipa
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        // Adiciona o jogador fornecido à lista de jogadores.

        System.out.println("Jogador " + jogador.getNome() + " adicionado com sucesso!");
        // Exibe uma mensagem de confirmação ao adicionar um jogador.
    }

    // Método para listar todos os jogadores da equipa
    public void listarJogadores() {
        System.out.println("\nLista de Jogadores:");
        // Exibe o título da seção de jogadores.

        if (jogadores.isEmpty()) {
            // Verifica se a lista de jogadores está vazia.
            System.out.println("Nenhum jogador foi adicionado a equipa.");
            // Exibe uma mensagem caso não haja jogadores cadastrados.
        } else {
            for (Jogador jogador : jogadores) {
                // Itera sobre todos os jogadores da lista.
                System.out.println(jogador);
                // Exibe a representação textual de cada jogador (usando o método "toString" da classe "Jogador").
            }
        }
    }

    // Getters para acessar os atributos da classe
    public String getTreinador() {
        return treinador;
        // Retorna o nome do treinador principal.
    }

    public String getTreinadorAdjunto() {
        return treinadorAdjunto;
        // Retorna o nome do treinador adjunto.
    }

    public String getDelegado() {
        return delegado;
        // Retorna o nome do delegado.
    }

    public String getDivisao() {
        return divisao;
        // Retorna a divisão da equipa.
    }

    public Clube getClube() {
        return clube;
        // Retorna o objeto "Clube" associado à equipa.
    }

    public String getFisio() {
        return fisio;
        // Retorna o nome do fisioterapeuta.
    }
}
/*# Conceitos de Herança, Upcasting e Downcasting no Projeto de Gestão de Futebol

## 1. Herança
A herança é usada no projeto para que classes específicas possam reutilizar os atributos e métodos de uma classe mais genérica. Veja os exemplos:

- A classe **Escalao** herda da classe **Clube** (não explicitamente mostrado no código atual, mas suposto pelo contexto).
    - Exemplo: `Escalao` pode acessar atributos e métodos definidos na classe `Clube`, como `getNome()` e `getAnoFundacao()`.

Essa relação reflete o conceito de "é um tipo de". No caso, o escalão "é um tipo de clube", mas com atributos específicos como idade mínima e máxima.

---

## 2. Upcasting
Upcasting ocorre quando um objeto de uma classe derivada é tratado como se fosse da classe base. Embora não haja exemplos explícitos no código fornecido, este conceito pode ser aplicado ao associar objetos derivados às suas classes base.

- Possível uso:
    - Um objeto da classe `Escalao` pode ser tratado como um objeto da classe `Clube` em algum método ou atribuição.
    - Exemplo (hipotético):
      ```java
      Clube clubeBase = new Escalao("Sub-20", 2000, 18);
      ```
      Nesse caso, o objeto `Escalao` está sendo tratado como se fosse do tipo `Clube`.

---

## 3. Downcasting
Downcasting ocorre quando convertemos um objeto da classe base para um tipo mais específico (classe derivada). Assim como o upcasting, não há exemplos explícitos no código fornecido, mas pode ser necessário em casos como:

- Possível uso:
    - Suponha que temos uma referência de tipo `Clube` que na verdade aponta para um objeto `Escalao`. Para acessar métodos ou atributos específicos de `Escalao`, seria necessário downcasting.
    - Exemplo (hipotético):
      ```java
      Clube clubeBase = new Escalao("Sub-20", 2000, 18);
      if (clubeBase instanceof Escalao) {
          Escalao escalao = (Escalao) clubeBase;
          System.out.println("Idade mínima do escalao: " + escalao.getIdadeMinima());
      }
      ```
      Aqui, o objeto `clubeBase` é convertido novamente para o tipo `Escalao`.

---
*/