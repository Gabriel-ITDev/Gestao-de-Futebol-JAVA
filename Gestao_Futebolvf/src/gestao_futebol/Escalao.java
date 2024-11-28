/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao_futebol; 
// Declara que esta classe faz parte do pacote "gestao_futebol". Pacotes são usados para organizar classes relacionadas.

/**
 *
 * @author Gabriel Alexandre Silva 2023101421
 */


public class Escalao {
    // Declaração da classe pública "Escalao". Esta classe representa um escalão de futebol.

    private String nome;
    // Declara uma variável privada "nome" do tipo String, que armazenará o nome do escalão.

    private int anoFundacao;
    // Declara uma variável privada "anoFundacao" do tipo int, que armazenará o ano de fundação do escalão.

    private int idadeMinima;
    // Declara uma variável privada "idadeMinima" do tipo int, que representará a idade mínima permitida no escalão.

    private int idadeMaxima; 
    // Declara uma variável privada "idadeMaxima" do tipo int, que representará a idade máxima permitida no escalão.

    public Escalao(String nome, int anoFundacao, int idadeMinima) {
        // Construtor público da classe "Escalao". Este é usado para inicializar objetos da classe com valores específicos.

        this.nome = nome;
        // Atribui o valor do parâmetro "nome" ao atributo da classe "nome".

        this.anoFundacao = anoFundacao;
        // Atribui o valor do parâmetro "anoFundacao" ao atributo da classe "anoFundacao".

        this.idadeMinima = idadeMinima;
        // Atribui o valor do parâmetro "idadeMinima" ao atributo da classe "idadeMinima".

        this.idadeMaxima = idadeMaxima; 
        // O atributo "idadeMaxima" está sendo inicializado, mas não foi passado como parâmetro no construtor.
        // (É um possível erro ou omissão no código, pois o valor de idadeMaxima não foi atribuído corretamente.)
    }

    public String getNome() {
        return nome;
        // Método público que retorna o valor do atributo "nome".
    }

    public int getIdadeMinima() {
        return idadeMinima;
        // Método público que retorna o valor do atributo "idadeMinima".
    }

    public int getIdadeMaxima(){
        return idadeMaxima; 
        // Método público que retorna o valor do atributo "idadeMaxima".
    }
}
