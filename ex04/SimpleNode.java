class SimpleNode {
    private int key;
    private SimpleNode prev;
    private SimpleNode next;

    public SimpleNode() {
    }

    public SimpleNode(int key, SimpleNode prev, SimpleNode next) {
        this.key = key;
        this.prev = prev;
        this.next = next;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public SimpleNode getPrev() {
        return prev;
    }

    public void setPrev(SimpleNode prev) {
        this.prev = prev;
    }

    public SimpleNode getNext() {
        return next;
    }

    public void setNext(SimpleNode next) {
        this.next = next;
    }
}