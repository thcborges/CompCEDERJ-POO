class Conta {
  private final String nome;
  private final int codigo;
  private final Banco banco;
  private float saldo;

  Conta (String nome, int cod, Banco banco) {
    this.nome = nome;
    this.codigo = cod;
    this.banco = banco;
    saldo = 0f;
  }

  public Banco pegaBanco() {
    return this.banco;
  }

  public String pegaNome() {
    return nome;
  }

  public int pegaCodigo() {
    return this.codigo;
  }

  public float pegaSaldo() {
    return this.saldo;
  }

  public void aplica(float deposito) {
    this.saldo += deposito;
  }

  public void retira(float saque) {
    this.saldo -= saque;
  }
}

class Banco {
  static int prox_banco = 1;
  final int MAX_CONTAS = 10;
  private final String nome;
  private final int codigo;
  private int prox_conta, ind_array;
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
      c = new Conta(nome, prox_conta++, this);

      contas[ind_array++] = c;
    }
    return c;
  }

  public Conta buscaConta(int cod) {
    int i;
    for (Conta conta: contas ) {
      if (conta.pegaCodigo() == cod) {
          return conta;
      }
    }
    return null;
  }
}

class Teste {
  public static void main(String[] args) {
    Banco itau = new Banco ("Itau");
    Conta b, maria = itau.criaConta("Maria");
    System.out.println(itau.pegaCodB());
    System.out.println(itau.pegaNomeB());
    b = itau.buscaConta(1);
    System.out.println(b.pegaBanco());
    System.out.println(b.pegaNome());
    // b = itau.buscaConta(2);
    Banco bb = new Banco("Banco do Brasil");
    Conta jose = bb.criaConta("Jose");
    System.out.println(jose.pegaNome());
    System.out.println(jose.pegaCodigo());
    System.out.println(jose.pegaSaldo());
    jose.aplica(100.0f);
    jose.retira(30.5f);
    System.out.println(jose.pegaSaldo());
  }
}
