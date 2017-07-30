class Point {
  int x, y;
  void move (int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }
}

public static void main (String[] args) {
  Point p = new Point();
  p.move(6, 3);
  p.x = 0;
}
