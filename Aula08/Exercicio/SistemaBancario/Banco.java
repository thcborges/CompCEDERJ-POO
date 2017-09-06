package SistemaBancario;

public class Banco {
    private static int prox_banco = 1;
    private final int MAX_CONTAS = 10;
    private String nome;
    private int codigo, prox_conta;
    private int ind_array;
    private Conta[] contas;

    public Banco(String n) {
        this.nome = n;
        this.codigo = prox_banco++;
        prox_conta = 1;
        contas = new Conta[MAX_CONTAS];
        ind_array = 0;
    }

    public int getCodigoBanco(){
        return this.codigo;
    }

    public String getNomeBanco() {
        return this.nome;
    }

    public void setNomeBanco(String nome) {
        this.nome = nome;
    }

    public Conta getConta(int conta) {
        int i;
        for (i = 0; i < ind_array; i++) {
            if (this.contas[i].getCodigo() == conta) {
                return contas[i];
            }
        }
        return null;
    }

    public Conta criaConta(String nome) {
        Conta conta;
        if (this.ind_array == this.MAX_CONTAS) {
            conta = null;
        } else {
            conta = new Conta(nome, this.prox_conta++, this);
            this.contas[this.ind_array++] = conta;
        }
        return conta;
    }

    public Poupanca criaPoupanca(String nome) {
        Poupanca poupanca;
        if (this.ind_array == this.MAX_CONTAS) {
            poupanca = null;
        } else {
            poupanca = new Poupanca(nome, this.prox_conta++, this);
            contas[ind_array++] = poupanca;
        }
        return poupanca;
    }
}