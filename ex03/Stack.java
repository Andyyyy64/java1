class Stack {

  private int[] data;
  private int top;

  public Stack() {
    data = new int[100];
    top = -1;
  }

  public void push(int value) {
    if (top < data.length - 1) {
      top++;
      data[top] = value;
    }
  }

  public int pop() {
    if (top >= 0) {
      int value = data[top];
      top--;
      return value;
    }
    return -1;
  }
}
