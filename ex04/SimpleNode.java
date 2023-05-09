class SimpleNode {
    private int key;
    private SimpleNode prev;
    private SimpleNode next;

    public SimpleNode() {
    }

    public SimpleNode(int key, SimpleNode prev, SimpleNode next) { // コンストラクタ
        this.key = key;
        this.prev = prev;
        this.next = next;
    }

    public int getKey() { // キーを返す
        return key;
    }

    public void setKey(int key) { // キーを設定
        this.key = key;
    }

    public SimpleNode getPrev() { // 前の要素への参照を返す
        return prev;
    }

    public void setPrev(SimpleNode prev) { // 前の要素への参照を設定する
        this.prev = prev;
    }

    public SimpleNode getNext() { // 次の要素への参照を返する
        return next;
    }

    public void setNext(SimpleNode next) { // 次の要素への参照を設定する
        this.next = next;
    }
}