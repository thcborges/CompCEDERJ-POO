public class ClienteBanco {
  String nome;
  int conta;
  float saldo;

  ClienteBanco (String pNome, int pConta, float pSaldo) {
    nome = pNome;
    conta = pConta;
    saldo = pSaldo;
  }

  void RealizaSaque (float valor) {
    saldo -= valor;
  }

  float RequisitaSaldo() {
    return saldo;
  }

  public static void main (String arg[]) {
    ClienteBanco cliente1, cliente2;

    cliente1 = new ClienteBanco("eu", 0001, 500);
    cliente2 = new ClienteBanco("voce", 0002, 2000);

    System.out.println("Nome do Cliente: " + cliente1.nome);
    System.out.println("Saldo: " + cliente1.saldo);
  }
  
}
