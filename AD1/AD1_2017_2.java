/*
 *
 *  Programaçao Orientada a Objetos - AD1 2017.2
 *
 *  Nome: Thiago da Cunha Borges
 *  Polo: Rocinha
 *
 */


 /*
  *   CONSIDERAÇÕES:
  *   - Compilei e rodei corretamente o código no windows 10
  *   e em uma máquina virtual com Ubuntu 16.04.
  *   Porém, ao rodar no windows, como meu notebook foi
  *   importado eu recebo a seguinte saída:
  *
  *   1) Qual Ã© o nÃºmero da Ãºltima versÃ£o do Java?
  *
  *   2) Assinale verdadeiro ou falso para os itens:
  *   ( )Java foi lanÃ§ada hÃ¡ mais de 20 anos atrÃ¡s
  *   ( )OO surgiu com a linguagem Java
  *   ( )Eclipse Ã© um editor de texto multilinguagem
  *
  *   Provavelmente porque o meu notebook não está configurado
  *   para Unicode.
  *   Por favor, caso obtenha o mesmo problema, para obter
  *   uma saída 100% de acordo com o que
  *   foi pedido, peço que compile o código da forma abaixo:
  *
  *   javac AD1_2017_2.java -encoding utf8
  *
  *   Assim os acentos serão impressos corretamente.
  */



/*
 *  Classe Questão
 *
 *  Não fiz alterações nessa classe.
 *  Está exatamente como descrita na AD
 */
class Questao {
    private String enunciado;

    public Questao(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return this.enunciado;
    }
}


/*
 *  Classe Discursiva
 *
 *  Praticamente não alterei. Apenas coloquei um
 *  @Override no método toString()
 */
class Discursiva extends Questao {
    private String gabarito;

    public Discursiva(String enunciado, String gabarito) {
        super(enunciado);
        this.gabarito = gabarito;
    }

    public String getGabarito() {
      return this.gabarito;

    }

    @Override
    public String toString() {
        return this.getEnunciado() + "\n";

    }

}



/*
 *  Classe ItemVerdadeiroFalso
 *  Classe filha de Questao
 *
 *  Implementada conforme pedido na questão a)
 *
 *  Cada objeto instaciado dessa classe é um item de questão
 *  Verdadeiro ou Falso.
 */
class ItemVerdadeiroFalso extends Questao{
    private boolean gabarito;       /// Armazena a resposta da questão.
                              /// Caso seja verdadeiro, seu valor é true
                              /// Caso seja falso, seu valor é false

    public ItemVerdadeiroFalso(String enunciado, boolean gabarito) {
        super(enunciado);           /// Passa os parâmetros necessários
                                    /// para iniciar a classe pai
        this.gabarito = gabarito;
    }

    /*
     *  Método getGabarito()
     *
     *  Retorna a resposta correta da questão
     */
    public boolean getGabarito() {
        return this.gabarito;
    }

    /*
     *  Método toString() - Sobreescreve o método toString() da classe object
     *
     *  Retorna o enunciado da questão em formato de String.
     */
    @Override
    public String toString() {
        return "( )" + this.getEnunciado();
    }

}



/*
 *  Classe VerdadeiroFalso
 *  Classe filha de Questao
 *
 *  Implementada conforme pedido na questão a)
 *
 *  Cria uma questão Verdaeiro ou falso.
 *  Recebe como parâmetro apenas um array de ItemVerdadeiroFalso.
 *  O enunciado da questão é passado como uma string permanente.
 *  Poderia escrever um segundo construtor que recebesse o enunciado,
 *  mas achei desnecessário devido a simplicidade do item.
 */
class VerdadeiroFalso extends Questao{
    private ItemVerdadeiroFalso[] itens;    /// Array com os itens

    public VerdadeiroFalso(ItemVerdadeiroFalso[] itens) {
        super("Assinale verdadeiro ou falso para os itens:\n");   /// Passa os parâmetros necessários
                                                                  /// para iniciar a classe pai
        this.itens = itens;
    }


    /*
     *  Método toString() - Sobreescreve o método toString() da classe object
     *
     *  Retorna o enunciado da questão mais todos os itens da questão em formato de String.
     */
    @Override
    public String toString() {
        String questao = this.getEnunciado();
        for (Questao q : this.itens) {
            questao += q + "\n";
        }
        return questao;
    }
}


/*
 *  Classe Prova
 *
 *  Implementada conforme pedido nas questões b) e c)
 *
 *  É iniciada apenas recevendo um inteiro, que será a quantidade de questões
 *  presentes na prova.
 *  As questões são armazenadas em um array de Questao.
 *  Poderia ser criado um novo construtor recebendo um array de questões para
 *  assim existir a possibilidade de serem criadas provas diferentes utilizando
 *  essa mesma classe.
 */
class Prova {
    private Questao[] questoes;

    public Prova(int qtdItens) {
        questoes = new Questao[qtdItens];     /// Inicia o array de questoes com a quantidade de
                                              /// questões que existirão na prova.
        questoes[0] = new Discursiva(                                   /// Insere uma questão discursiva na primeira
                "Qual é o número da última versão do Java?", "8");      /// posição do array

        ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];       /// Instancia um array de ItemVerdadeiroFalso
                                                                        /// de 3 posições
        itens[0] = new ItemVerdadeiroFalso(                             /// Insere um item na primeira posição do array
                "Java foi lançada há mais de 20 anos atrás", true);
        itens[1] = new ItemVerdadeiroFalso(                             /// Insere um item na segunda posição do array
                "OO surgiu com a linguagem Java", false);
        itens[2] = new ItemVerdadeiroFalso(                             /// Insere um item na terceira posição do array
                "Eclipse é um editor de texto multilinguagem", true);

        questoes[1] = new VerdadeiroFalso(itens);       /// Insere uma questão VerdadeiroFalso na segunda posição
                                                        /// do array questoes

    }


    /*
     *   Método impressao()
     *
     *   Conforme pedido na questão c)
     *   Método que exibe na tela todas as questões da prova.
     *
     */
    public void impressao() {
      System.out.println(this);
    }


    /*
     *  Método toString() - Sobreescreve o método toString() da classe object
     *
     *  Retorna o enunciado de cada questão da prova.
     *  É exibido o número correspondente da questão, conforme enunciado da AD.
     */
    @Override
    public String toString(){
        String prova = "";
        int num = 1;
        for (Questao q : this.questoes) {
            prova += num + ") " + q + "\n";
            num++;
        }
        return prova;
    }

}


/*
 *  Classe principal
 *
 *  Conforme pedido na questão d)
 *  Somente é instanciado um Prova e exibido suas questões.
 *  Dessa forma, a classe principal ficou bem simples.
 */
public class AD1_2017_2 {
    public static void main(String[] args) {

        Prova prova = new Prova(2);
        prova.impressao();

    }
}
