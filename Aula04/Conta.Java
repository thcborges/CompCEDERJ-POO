class ClienteConta {
  private String nome;
  private int prox_conta = 0;
  private int conta;
  private float saldo;
  private static float taxa_CPMF = 0.38f;

  ClienteConta (String nome) {
    this.nome = nome;
    this.conta = this.prox_conta++;
    this.saldo = 0;
  }
 public String getNome(){
   return this.nome;
 }
 public void setNome(String nome) {
   this.nome = nome;
 }
 public int getConta() {
   return this.conta;
 }
 public void setConta(int conta) {
   this.conta = conta;
 }
 public float getSaldo() {
   return this.saldo;
 }
 public void setSaldo(float saldo) {
   this.saldo = saldo;
 }
 public float getCPMF() {
   return this.taxa_CPMF;
 }

 public float RequisitaSaldo() {
   return this.getSaldo();
 }

 public void RealizaSaque(float valor) {
   this.setSaldo(this.getSaldo() - valor);
 }

}

class ClienteCC extends Conta {
  private float especial;

  ClienteCC (String nome, float especial) {
    super(nome);
    this.especial = especial;
  }
  public float getEspecial() {
    return this.especial;
  }
  public void setEspecial(float especial) {
    this.especial = especial;
  }

}


class ClientePoupanca extends Conta {
  private float taxa_juros;

  ClientePoupanca (String nome) {
    super(nome);
    this.taxa_juros = 1.0f;
  }
  public float TaxaJuros() {
    return this.taxa_juros;
  }
  public void TaxaJuros(float taxa_juros) {
    this.taxa_juros = taxa_juros;
  }
}


class ClientePF extends ClienteCC {
  ClientePF (String nome, float especial) {
    super(nome, especia;);
  }
}


class ClientePJ extends ClienteCC {
  ClientePJ (String nome, float especial) {
    super(nome, especial);
  }
}

class Conta {
  public static void main(String[] args) {

  }
}
