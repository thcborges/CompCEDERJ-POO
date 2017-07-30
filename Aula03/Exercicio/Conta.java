class Conta {
  private String nome;
  private int codigo;
  private Banco banco;
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
    this.saldo -= soma;
  }
}
