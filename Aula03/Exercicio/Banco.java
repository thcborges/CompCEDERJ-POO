class Banco {
  static int prox_banco = 1;
  final int MAX_CONTAS = 10;
  private String nome;
  private int codigo, prox_conta, ind_array;
  Conta[] contas;

  Banco (String nome) {
    this.nome = nome;
    this.codigo = prox_banco++;
    prox_conta = 1;
    contas = new Conta[MAX_CONTAS];
    ind_array = 0;
  }

  public int pegaCodB() {
    return this.codigo;
  }

  public String pegaNomeB() {
    return this.nome;
  }

  Conta criaConta (String nome) {
    Conta c;
    if (prox_conta == MAX_CONTAS)
      c = null;
    else {
      c = new Conta(Nome, prox_conta++, this);

      conta[ind_array++] = c;
    }
    return c;
  }

  public Conta buscaConta(int cod) {
    int i;
    for (Conta conta: contas ) {
      if (conta.pegaCodigo() == cod) return conta
    }
    return null;
  }
}
