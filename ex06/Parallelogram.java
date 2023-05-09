class Parallelogram extends Quadrangle {
    public Parallelogram(Point p1, Point p2, int width) {
        super(p1, new Point(p1.getX() + width, p1.getY()), p2, new Point(p2.getX() - width, p2.getY()));
    }
}
