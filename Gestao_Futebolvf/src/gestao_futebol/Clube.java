/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestao_futebol; 
// Declara que esta classe faz parte do pacote "gestao_futebol".

/**
 *
 * @author Gabriel Alexandre Silva 2023101421
 */


public class Clube {
    // Declaração da classe "Clube", que representa um clube de futebol. Esta será a superclasse.

    private String nome;
    // Atributo privado que armazenará o nome do clube.

    private int anoFundacao;
    // Atributo privado que armazenará o ano de fundação do clube.

    public Clube(String nome, int anoFundacao) {
        // Construtor da classe "Clube". É usado para inicializar os atributos da classe.
        this.nome = nome;
        // Inicializa o atributo "nome" com o valor fornecido no parâmetro.

        this.anoFundacao = anoFundacao;
        // Inicializa o atributo "anoFundacao" com o valor fornecido no parâmetro.
    }

    public String getNome() {
        return nome;
        // Método getter que retorna o valor do atributo "nome".
    }

    public int getAnoFundacao() {
        return anoFundacao;
        // Método getter que retorna o valor do atributo "anoFundacao".
    }

    public static double getTaxaInscricao() {
        // Método estático que retorna uma taxa de inscrição padrão para o clube.
        return 50.0;  // Exemplo de taxa fixa.
    }
}

   
    
        
        
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//       
//super classe -> nome do clube, ano de fundação, taxa de inscrições no clube
// sub classe -> cada escalão herda do clube e possui atributos especificos como a idade minima permitida
// classe de composição -> contem informações do treinador, divisão, e uma lista de atletas, e um referencia a super classe clube
// classe teste -> contem o metodo main() para intanciar e testar as funcionalidades das classes        
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//

// a super classe contem atributos basicos do clube como nome ano de fundação, possui um atributo estatisctico taxaIncrição, representado um taxa padrão para o clube 
// a sub classe escalão herda da classe clube e adiciona o atributo idadeMinima
// a classe de teste instancia as classes criadas, demonstra a herança e a composição e exibe as informações
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
