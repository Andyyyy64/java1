public class Point {

  private int x;
  private int y;

  public static int X_MIN;
  public static int X_MAX;
  public static int Y_MIN;
  public static int Y_MAX;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void move(int dx, int dy) {
    int newX = x + dx;
    int newY = y + dy;

    if (newX >= X_MIN && newX <= X_MAX && newY >= Y_MIN && newY <= Y_MAX) {
      x = newX;
      y = newY;
    }
  }
}
