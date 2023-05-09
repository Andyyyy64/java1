public class PrimitiveCall {
    private void movePoint(int x, int y) {
        x = 100;
        y = 120;
    }

    public void test() {
        int x = 8;
        int y = 5;
        movePoint(x, y);
        System.out.println("(x, y) = (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        new PrimitiveCall().test();
    }
}
