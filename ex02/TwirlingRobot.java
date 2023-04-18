class TwirlingRobot {

  private int x;
  private int y;
  private int dir;

  public void initialize(int x, int y, int dir) {
    this.x = x;
    this.y = y;
    this.dir = dir;
  }

  public void turnLeft() {
    dir = (dir + 3) % 4;
  }

  public void turnRight() {
    dir = (dir + 1) % 4;
  }

  public void move() {
    int newX = x;
    int newY = y;

    switch (dir) {
      case 0:
        newY--; // Fix the North movement direction
        break;
      case 1:
        newX++;
        break;
      case 2:
        newY++;
        break;
      case 3:
        newX--;
        break;
    }

    if (newX >= -4 && newX <= 4 && newY >= -4 && newY <= 4) {
      x = newX;
      y = newY;
    }
  }

  public void printLocation() {
    System.out.printf("(%d, %d)%n", x, y);
  }
}
