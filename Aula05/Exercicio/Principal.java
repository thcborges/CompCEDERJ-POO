
class Banco {
  private int prox_banco = 1;
  private final int MAX_CONTAS = 10;
  private String nome;
  private int codigo, prox_conta, ind_array;
  private Conta[] contas;

  Banco (String nome) {
    this.nome = nome;
    this.codigo = prox_banco;
    this.contas = new Conta[this.MAX_CONTAS];
    this.ind_array = 0;
  }
  public int getCodigo() {
    return this.codigo;
  }

  public String getNome() {
    return this.nome;
  }

  public Conta criaConta(String nome) {
    Conta conta;
    if (this.ind_array == MAX_CONTAS) {
      conta = null;
    } else {
      conta = new Conta (nome, prox_conta++, this);
      this.contas[this.ind_array++] = conta;
    }

    return conta;
  }

  public Conta buscaConta(int conta) {
    int i;
    for (i = 0; i < this.ind_array; i++) {
      if (contas[i].getCodigo() == conta) {
        return this.contas[i];
      }
    }
    return null;
  }

  public Poupanca criaPoupanca(String nome) {
    Poupanca poupanca;
    if (this.ind_array == MAX_CONTAS) {
      poupanca = null;
    } else {
      poupanca = new Poupanca(nome, prox_conta, this);
      this.contas[this.ind_array++] = poupanca;
    }
    return poupanca;
  }

}


class Conta {
  private String nome;
  private int codigo;
  private Banco banco;
  private float saldo;

  Conta (String nome, int conta, Banco banco) {
    this.nome = nome;
    this.codigo = codigo;
    this.banco = banco;
    this.saldo = 0f;
  }

  public Banco getBanco() {
    return this.banco;
  }

  public String getNome() {
    return this.nome;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setSaldo(float valor) {
    this.saldo = valor;
  }

  public void aplica(float valor) {
    this.setSaldo(this.getSaldo() + valor);
  }

  public void retira(float valor) {
    this.setSaldo(this.getSaldo() - valor);
  }

  @Override
  public String toString() {
    return "Conta corrente";
  }
}


class Poupanca extends Conta {
  Poupanca (String nome, int conta, Banco banco) {
    super(nome, conta, banco);
  }

  @Override
  public void retira(float valor) {
    if (this.getSaldo() - valor < 0) {
      System.out.println("A poupança não pode ter saldo negativo.");
    } else {
      this.setSaldo(this.getSaldo() - valor);
    }
  }

  @Override
  public String toString() {
    return "Poupança";
  }
}

class Principal {

  public static void main(String[] args) {
    Banco itau = new Banco("Itau");
    System.out.println(itau.getCodigo());
    System.out.println(itau.getNome());

    Conta maria = itau.criaConta("Maria");
    System.out.println(maria);

    Conta b = itau.buscaConta(1);
    b = itau.buscaConta(2);

    Poupanca jose = itau.criaPoupanca("Jose");
    System.out.println(jose + " " + jose.getNome());
    System.out.println(jose + " " + jose.getCodigo());
    System.out.println(jose + " " + jose.getSaldo());

    jose.aplica(100.0f);
    System.out.println(jose + " " + jose.getSaldo());

    jose.retira(150.0f);
    System.out.println(jose + " " + jose.getSaldo());

    jose.retira(30.5f);
    System.out.println(jose + " " + jose.getSaldo());
  }
}
