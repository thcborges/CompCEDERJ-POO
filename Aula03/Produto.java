class Produto {
  static int prox_id = 0;
  int id;
  Produto() {
    id = prox_id++;
  }

  public static void main(String[] args) {
    Produto l = new Produto();
    Produto c = new Produto();
  }
}
