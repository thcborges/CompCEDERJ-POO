class Empregado {
  private final String nome;
  private float salario;
  private final int ano;

  Empregado(String nome, float salario, int ano) {
    this.nome = nome;
    this.salario = salario;
    this.ano = ano;

  }

  public String getNome() {
    return this.nome;
  }

  public float getSalario() {
    return this.salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public int getAno() {
    return this.ano;
  }

  public void aumentaSalario (float porcentagemAumento) {
    this.setSalario(this.getSalario() * (1 + porcentagemAumento));
  }

  @Override
  public String toString() {
    return "Empregado";
  }

  public void imprime() {
    System.out.println(this + ": " + this.getNome() + " " + this.getAno() + " " + this.getSalario());
  }

}

class Secretaria extends Empregado {
  private String[] contatos;
  private int pos_livre = 0;

  Secretaria (String nome, float salario, int ano) {
    super(nome, salario, ano);
    this.contatos = new String[5];

  }

  public void guardaNome(String nome) {
    this.contatos[this.pos_livre++] = nome;

    if (this.pos_livre == 5) {
      this.pos_livre = 0;
    }

  }

  @Override
  public String toString() {
    return "Secretaria";
  }

}

class Gerente extends Empregado {
  private Secretaria secretaria;
  private Empregado[] subordinados;

  Gerente (String nome, float salario, int ano, Secretaria secretaria, Empregado empregado1, Empregado empregado2) {
    super(nome, salario, ano);
    this.subordinados = new Empregado[2];
    this.secretaria = secretaria;
    this.subordinados[0] = empregado1;
    this.subordinados[1] = empregado2;

  }

  @Override
  public String toString() {
    return "Gerente";
  }

  public void aumento() {
    this.secretaria.aumentaSalario(0.1f);
    int i;
    for (i = 0; i < 2; i++) {
      this.subordinados[i].aumentaSalario(0.15f);
    }

  }

  @Override
  public void imprime() {
    super.imprime();
    this.secretaria.imprime();
    int i;
    for (i = 0; i < 2; i++) {
      this.subordinados[i].imprime();
    }

  }

}

class Loja {
  public static void main(String[] args) {
    Empregado[] lista = new Empregado[4];
    lista[0] = new Secretaria("Maria", 1000f, 2000);
    lista[1] = new Empregado("Jose", 500f, 1998);
    lista[2] = new Empregado("Joao", 700f, 2001);
    lista[3] = new Gerente("Vitor", 5000f, 1999, (Secretaria) lista[0], lista[1], lista[2]);

    for (int i = 0; i < 4; i++) {
      lista[i].imprime();
    }
    System.out.println();
    ((Gerente) lista[3]).aumento();

    for (int i = 0; i < 4; i++) {
      lista[i].imprime();
    }

  }

}
