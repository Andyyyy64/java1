public class Point {
    private int x;
    private int y;

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

        if (Math.abs(newX) <= 100 && Math.abs(newY) <= 100) {
            x = newX;
            y = newY;
        }
    }
}

