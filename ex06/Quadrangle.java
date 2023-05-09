class Quadrangle extends Shape {
    private Point[] points;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.points = new Point[]{p1, p2, p3, p4};
    }

    @Override
    public void move(int dx, int dy) {
        for (Point p : points) {
            p.move(dx, dy);
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.print(points[0] + "-" + points[1] + "-" + points[2] + "-" + points[3]);
    }
}
