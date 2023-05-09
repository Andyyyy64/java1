public class MovingPoint extends Point {
    private int vx;
    private int vy;

    public MovingPoint(int x, int y) {
        super(x, y);
    }

    public void setVelocity(int vx, int vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void move() {
        int newX = getX() + vx;
        int newY = getY() + vy;
        setX(newX);
        setY(newY);
    }
}

