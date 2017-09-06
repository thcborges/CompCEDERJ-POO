package SistemaBancario;

public class Poupanca extends Conta {
    public Poupanca(String nome, int codigo, Banco banco) {
        super(nome, codigo, banco);
    }

    @Override
    public void retira(float valor) {
        if (super.getSaldo() - valor < 0) {
            System.out.println("A poupança não pode ter saldo negativo");
        } else {
            super.retira(valor);
        }
    }

    @Override
    public String toString() {
        return "Poupança";
    }
}