package gestao_futebol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe abstrata
abstract class EntidadeEsportiva {
    private String nome;

    public EntidadeEsportiva(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirInformacoes(); // Método abstrato
    public abstract double calcularOrcamento(); // Método abstrato
}

// Classe Clube herda da classe abstrata EntidadeEsportiva
class Clube extends EntidadeEsportiva {
    private int anoFundacao;
    private static final double TAXA_INSCRICAO = 500.0;

    public Clube(String nome, int anoFundacao) {
        super(nome);
        this.anoFundacao = anoFundacao;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public static double getTaxaInscricao() {
        return TAXA_INSCRICAO;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Clube: " + getNome() + " (Fundado em: " + anoFundacao + ")");
    }

    @Override
    public double calcularOrcamento() {
        return TAXA_INSCRICAO * 10; // Exemplo de cálculo baseado na taxa de inscrição
    }
}

// Classe Escalao
class Escalao {
    private String nome;
    private int idadeMinima;
    private int idadeMaxima;

    public Escalao(String nome, int idadeMinima, int idadeMaxima) {
        this.nome = nome;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }
}

// Classe Equipa
class Equipa {
    private String treinador;
    private String treinadorAdjunto;
    private String delegado;
    private String divisao;
    private String fisio;
    private Clube clube;
    private List<Jogador> jogadores;

    public Equipa(String treinador, String treinadorAdjunto, String delegado, String divisao, Clube clube) {
        this.treinador = treinador;
        this.treinadorAdjunto = treinadorAdjunto;
        this.delegado = delegado;
        this.divisao = divisao;
        this.clube = clube;
        this.jogadores = new ArrayList<>();
    }

    public String getTreinador() {
        return treinador;
    }

    public String getTreinadorAdjunto() {
        return treinadorAdjunto;
    }

    public String getDelegado() {
        return delegado;
    }

    public String getDivisao() {
        return divisao;
    }

    public String getFisio() {
        return fisio;
    }

    public Clube getClube() {
        return clube;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.println("Jogadores da Equipa:");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador.getNome() + " (Idade: " + jogador.getIdade() + ", Posição: " + jogador.getPosicao() + ")");
        }
    }
}

// Classe Jogador
class Jogador {
    private String nome;
    private int idade;
    private String posicao;

    public Jogador(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }
}

// Classe principal Teste
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o Clube
        System.out.println("Insere o nome do clube:");
        String nomeClube = scanner.nextLine();

        System.out.println("Insere o ano de fundacao do clube:");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        // Criação do objeto Clube
        Clube clube = new Clube(nomeClube, anoFundacao);

        // Entrada de dados para o Escalao
        System.out.println("Insere o nome do escalao:");
        String nomeEscalao = scanner.nextLine();

        System.out.println("Insere a idade mínima para o escalao:");
        int idadeMinima = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Insere a idade máxima para o escalao:");
        int idadeMaxima = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Escalao escalao = new Escalao(nomeEscalao, idadeMinima, idadeMaxima);

        // Entrada de dados para a Equipa
        System.out.println("Insere o nome do treinador:");
        String treinador = scanner.nextLine();

        System.out.println("Insira o nome do treinador adjunto:");
        String treinadorAdjunto = scanner.nextLine();

        System.out.println("Insira o nome do delegado ao jogo:");
        String delegado = scanner.nextLine();

        System.out.println("Insira o nome do fisioterapeuta:");
        String fisio = scanner.nextLine();

        System.out.println("Insira a divisão da equipa:");
        String divisao = scanner.nextLine();

        Equipa equipa = new Equipa(treinador, treinadorAdjunto, delegado, divisao, clube);

        // Pergunta ao utilizador quantos jogadores existem no plantel
        System.out.println("Quantos jogadores existem no plantel?");
        int numeroJogadores = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        for (int i = 0; i < numeroJogadores; i++) {
            System.out.println("Insere o nome do jogador " + (i + 1) + ":");
            String nomeJogador = scanner.nextLine();

            System.out.println("Insere a idade do jogador:");
            int idadeJogador = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.println("Insere a posição do jogador:");
            String posicao = scanner.nextLine();

            Jogador jogador = new Jogador(nomeJogador, idadeJogador, posicao);
            equipa.adicionarJogador(jogador);
        }

        // Exibe informações
        System.out.println("\n=== Informações do Clube ===");
        clube.exibirInformacoes();

        System.out.println("\n=== Informações do Escalão ===");
        System.out.println("Escalão: " + escalao.getNome() + " (Idade: " + escalao.getIdadeMinima() + " - " + escalao.getIdadeMaxima() + ")");

        System.out.println("\n=== Informações da Equipa ===");
        System.out.println("Treinador: " + equipa.getTreinador());
        System.out.println("Treinador Adjunto: " + equipa.getTreinadorAdjunto());
        System.out.println("Delegado: " + equipa.getDelegado());
        System.out.println("Divisão: " + equipa.getDivisao());

        System.out.println("\n=== Jogadores da Equipa ===");
        equipa.listarJogadores();

        scanner.close();
    }
}
