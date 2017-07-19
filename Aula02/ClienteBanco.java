public class ClienteBanco {
  String nome;
  int conta;
  float saldo;
  static float taxa_CPMF = 0.01f;  // Exemplo 1%

  ClienteBanco (String pNome, int pConta, float pSaldo) {
    // Construtor com 3 parâmetros
    this.nome = pNome;
    this.conta = pConta;
    this.saldo = pSaldo;
  }


  ClienteBanco(String pNome, int pConta) {
    // Construtor com 2 parâmetros
    /********************************
    *
    * O construtor com 2 parâmetros poderia ter a seguinte sintaxe a seguir:
    nome = pNome;
    conta = pConta;
    saldo = 200
    * No entanto, o this fará referência ao construtor da classe com 3
    * parâmetros e funcionará da mesma forma.
    *
    * Nota: Com o uso do this a sintaxe fica mais enxuta, porém o usando o
    * o método do comentário o código fica mais legível e compreensível.
    *
    *********************************/
    this(pNome, pConta, 200);
  }

  ClienteBanco() {
    // Construtor sem parâmetros
    this.nome = "Anonimo";
    this.conta = 0000;
    this.saldo = 200;
  }

  void RealizaSaque (float valor) {
    if (valor > saldo) {
      System.out.println("Saldo insuficiente");
    } else {
      this.saldo -= valor;
    }
  }

  void TransferirOutraConta (float pValor, ClienteBanco pBeneficiado) {
    this.RealizaSaque(pValor);
    pBeneficiado.RealizaDeposito(pValor);
  }

  void TransferirOutraContaCPMF (float pValor, ClienteBanco pBeneficiado) {
    this.RealizaSaque(pValor * (1 - taxa_CPMF));
    pBeneficiado.RealizaDeposito(pValor * (1 - taxa_CPMF));
  }

  float RequisitaSaldo() {
    return saldo;
  }

  void RealizaDeposito (float pValor) {
    this.saldo += pValor;
  }

  void RealizaDeposito(float pValorNota, int pQuantidadeNotas) {
    RealizaDeposito(pValorNota * pQuantidadeNotas);
  }

  public static void main (String arg[]) {
    ClienteBanco cliente1, cliente2, cliente3;

    cliente1 = new ClienteBanco("eu", 0001, 500);
    cliente2 = new ClienteBanco("voce", 0002, 2000);
    cliente3 = new ClienteBanco();

    System.out.println("-----Cliente1------");
    System.out.println("Nome: " + cliente1.nome);
    System.out.println("Conta: " + cliente1.conta);
    System.out.println("Saldo: " + cliente1.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente2-----");
    System.out.println("Nome: " + cliente2.nome);
    System.out.println("Conta: " + cliente2.conta);
    System.out.println("Saldo: " + cliente2.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente3-----");
    System.out.println("Nome: " + cliente3.nome);
    System.out.println("Conta: " + cliente3.conta);
    System.out.println("Saldo: " + cliente3.saldo);
    System.out.println("\n\n");

    cliente1.RealizaDeposito(230);
    System.out.println("Cliente1 deposita 230");
    cliente2.RealizaDeposito(50, 8);
    System.out.println("Cliente2 deposita 8 notas de 50, 400");

    System.out.println("-----Cliente1------");
    System.out.println("Nome: " + cliente1.nome);
    System.out.println("Conta: " + cliente1.conta);
    System.out.println("Saldo: " + cliente1.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente2-----");
    System.out.println("Nome: " + cliente2.nome);
    System.out.println("Conta: " + cliente2.conta);
    System.out.println("Saldo: " + cliente2.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente3-----");
    System.out.println("Nome: " + cliente3.nome);
    System.out.println("Conta: " + cliente3.conta);
    System.out.println("Saldo: " + cliente3.saldo);
    System.out.println("\n\n");

    cliente1.TransferirOutraConta(100, cliente2);
    System.out.println("Cliente1 transfere 100 para cliente2");

    System.out.println("-----Cliente1------");
    System.out.println("Nome: " + cliente1.nome);
    System.out.println("Conta: " + cliente1.conta);
    System.out.println("Saldo: " + cliente1.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente2-----");
    System.out.println("Nome: " + cliente2.nome);
    System.out.println("Conta: " + cliente2.conta);
    System.out.println("Saldo: " + cliente2.saldo);
    System.out.println("\n\n");

    System.out.println("-----Cliente3-----");
    System.out.println("Nome: " + cliente3.nome);
    System.out.println("Conta: " + cliente3.conta);
    System.out.println("Saldo: " + cliente3.saldo);
    System.out.println("\n\n");
  }

}
