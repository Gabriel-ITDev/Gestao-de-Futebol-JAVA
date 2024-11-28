package gestao_futebol; 
// Declara que esta classe faz parte do pacote "gestao_futebol".

// Gabriel Alexandre Silva 2023101421


public class Jogador {
    // Declaração da classe "Jogador", que representa um jogador de futebol.

    private String nome;
    // Atributo privado para armazenar o nome do jogador.

    private int idade;
    // Atributo privado para armazenar a idade do jogador.

    private String posicao;
    // Atributo privado para armazenar a posição do jogador no campo (ex: atacante, zagueiro, etc.).

    public Jogador(String nome, int idade, String posicao) {
        // Construtor da classe "Jogador". Inicializa os atributos com os valores fornecidos.

        this.nome = nome;
        // Atribui o valor do parâmetro "nome" ao atributo "nome".

        this.idade = idade;
        // Atribui o valor do parâmetro "idade" ao atributo "idade".

        this.posicao = posicao;
        // Atribui o valor do parâmetro "posicao" ao atributo "posicao".
    }

    public String getNome() {
        return nome;
        // Método getter que retorna o valor do atributo "nome".
    }

    public int getIdade() {
        return idade;
        // Método getter que retorna o valor do atributo "idade".
    }

    public String getPosicao() {
        return posicao;
        // Método getter que retorna o valor do atributo "posicao".
    }

    @Override
    public String toString() {
        // Sobrescreve o método "toString" da classe Object para fornecer uma representação em texto do objeto.

        return "Jogador: " + nome + ", Idade: " + idade + ", Posicao: " + posicao;
        // Retorna uma string formatada com os atributos do jogador.
    }
}
