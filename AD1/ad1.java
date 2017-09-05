class Questao {
private String enunciado;
public Questao(String enunciado) {this.enunciado = enunciado;}
public String getEnunciado() {return this.enunciado;}
}
class Discursiva extends Questao {
private String gabarito;
public Discursiva(String enunciado, String gabarito) {super(enunciado);this.gabarito = gabarito;}
public String getGabarito() {return this.gabarito;}
public String toString() {return this.getEnunciado() + "\n";}
}
class ItemVerdadeiroFalso extends Questao{
private boolean gabarito;
public ItemVerdadeiroFalso(String enunciado, boolean gabarito) {super(enunciado);.gabarito = gabarito;}

public boolean getGabarito() {return this.gabarito;}
public String toString() {return "( )" + this.getEnunciado();}
}

class VerdadeiroFalso extends Questao{
private ItemVerdadeiroFalso[] itens;
public VerdadeiroFalso(ItemVerdadeiroFalso[] itens) {super("Assinale verdadeiro ou falso para os itens:\n");this.itens = itens;}
public int getQuantidadeItens() {return this.itens.length;}
public String toString() {String questao = this.getEnunciado();for (Questao q : this.itens) {questao += q + "\n";}return questao;}
}

class Prova {
private Questao[] questoes;
public Prova(int qtdItens) {questoes = new Questao[qtdItens];questoes[0] = new Discursiva("Qual � o n�mero da �ltima vers�o do Java?", "8");ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];itens[0] = new ItemVerdadeiroFalso("Java foi lan�ada h� mais de 20 anos atr�s", true);itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);itens[2] = new ItemVerdadeiroFalso("Eclipse � um editor de texto multilinguagem", true);questoes[1] = new VerdadeiroFalso(itens);}
public String toString(){String prova = "";int num = 1;for (Questao q : this.questoes) {prova += num + ") " + q + "\n";num++;}return prova;}}
public class ad1 {
public static void main(String[] args) {Prova prova = new Prova(2);System.out.println(prova);}
}
