interface IObjVisual {
  void desenho();
}

interface IObjVisualDinamico extends IObjVisual {
  void movimenta(float x, float y);
}

abstract class ObjVisual {
  float pos_x, pos_y;
  abstract void desenho();
  void movimenta(float x, float y) {
    this.pos_x = x;
    this.pos_y = y;
    this.desenho();
  }
  
}

class Circulo extends ObjVisual implements IObjVisual {
  float raio;

  public void desenho() {

  }
}

class Retangulo implements IObjVisualDinamico {
  public void desenho() {

  }
  public void movimenta() {

  }
}
