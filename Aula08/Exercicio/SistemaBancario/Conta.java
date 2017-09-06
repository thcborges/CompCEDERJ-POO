package SistemaBancario;

public class Conta {
    private String nome;
    private int codigo;
    private Banco banco;
    private float saldo;

    public Conta(String nome, int codigo, Banco banco) {
        this.nome = nome;
        this.codigo = codigo;
        this.banco = banco;
        this.saldo = 0F;
    }

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void aplica(float valor) {
        this.saldo += valor;
    }

    public void retira(float valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta corrente";
    }
}