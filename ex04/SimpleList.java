class SimpleList {
    private SimpleNode nil;

    SimpleList() {
        init();
    }

    void init() {
        nil = new SimpleNode();
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    SimpleNode listSearch(int key) {
        SimpleNode node = nil.getNext();
        while (node != nil && node.getKey() != key) {
            node = node.getNext();
        }
        return node;
    }

    void printList() {
        SimpleNode node = nil.getNext();
        while (node != nil) {
            System.out.print(node.getKey() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    void delete(int key) {
        SimpleNode node = listSearch(key);
        if (node == nil) {
            return;
        }
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    void insert(int key) {
        SimpleNode newNode = new SimpleNode(key, nil, nil.getNext());
        nil.getNext().setPrev(newNode);
        nil.setNext(newNode);
    }
}