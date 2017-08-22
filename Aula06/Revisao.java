class Point {
  private int x, y;

  Point () {
    this.x = 0;
    this.y = 0;
  }

  Point (int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void move (int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  public void print() {
    System.out.println("Point(" + this.getX() + " ," + this.getY() + ") ");
  }

}

class Pixel extends Point {
  private int color;

  Pixel (int x, int y, int color) {
    super(x, y);
    this.color = color;
  }

  public int getColor() {
    return this.color;
  }

  public void print() {
    System.out.println("Pixel(" + this.getX() + ", " + this.getY() + ", " + this.getColor() + ")");
  }

}

class Revisao {
  public static void main(String[] args) {
    Point[] pontos = new Point[5];      // Vetor de pontos

    pontos[0] = new Point();
    pontos[1] = new Pixel(1, 2, 0);     // Um pixel é um ponto

    Point pt = new Pixel(0, 0, 1);      // OK! pixel é um ponto
    // Pixel px = new Point(0, 0) 	       Erro! ponto não é pixel

    /*****************************************
     *  Conversão explicita de um objeto
     *****************************************/

     Pixel px = (Pixel)pt;           // OK! pt contém um pixel
     pt = new Point();
    //  px = (Pixel)pt;               // ERRO! pt agora contém um ponto
    pt = new Pixel(0, 0, 0);
    // px = pt;                       // ERRO! pt não é sempre um pixel

    if (pt instanceof Pixel) {
      px = (Pixel)pt;
    }

    pt = new Point(7, 18);
    px = new Pixel(18, 7, 11);

    pt.print();
    px.print();

  }
}
