public class MovingPoint extends Point {
    private int vx, vy;

    public MovingPoint(int x, int y) {
        super(x, y);
    }

    public void setVelocity(int vx, int vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void move() {
        x += vx;
        y += vy;
    }
}
