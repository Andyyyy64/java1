class SimpleList {
    private SimpleNode nil;

    SimpleList() { // コンストラクタ
        init();
    }

    void init() { // リストの初期化処理
        nil = new SimpleNode();
        nil.setNext(nil);
        nil.setPrev(nil);
        // nil を新しい SimpleNode として初期化し、nil 自身を前後の要素への参照として設定する
        // これにより、空のリストが作成される
    }

    SimpleNode listSearch(int key) {
        SimpleNode node = nil.getNext(); // 最初に、リストの先頭のノード（nil.getNext()）を取得する。これが検索の開始点になる
        while (node != nil && node.getKey() != key) {
            // このループは、現在のノードが nil ではない（つまりリストの終わりに達していない）かつ、
            // 現在のノードのキーが検索対象のキーと一致しない間、続く
            node = node.getNext();
            // ループの各ステップで、現在のノードを次のノード（node.getNext()）に更新する
        }
        return node; // 最終的に、検索したキーを持つノードまたは nil（検索したキーが見つからない場合）を返す
    }

    void printList() {
        SimpleNode node = nil.getNext();
        while (node != nil) {
            System.out.print(node.getKey() + " ");
            node = node.getNext();
        }
        System.out.println();
        // リストに格納されている要素のキーを順番に出力する
    }

    void delete(int key) {
        SimpleNode node = listSearch(key);
        // listSearch(key) メソッドを使って、指定したキーを持つノードをリストから探す
        if (node == nil) {
            return; // 見つからなかったら何もしない
        }
        node.getPrev().setNext(node.getNext());
        // 削除するノード node の前のノード（node.getPrev()）の「次のノード」を、node の次のノード（node.getNext()）に設定する
        // これにより、削除するノード node をリストから外すことができる
        node.getNext().setPrev(node.getPrev());
        // 削除するノード node の次のノード（node.getNext()）の「前のノード」を、node の前のノード（node.getPrev()）に設定する
        // これにより、削除するノード node をリストから完全に切り離すことができる
    } 
    // このメソッドにより、指定したキーを持つノードがリストから削除され、リストの他のノードが適切に再接続される

    void insert(int key) {
        SimpleNode newNode = new SimpleNode(key, nil, nil.getNext());
        // 次のノード next として現在のリストの先頭ノード nil.getNext() を設定する
        nil.getNext().setPrev(newNode);
        // 現在のリストの先頭ノード（nil.getNext())の前のノードを新しく作成したノード newNode に設定する
        // これにより、新しいノードがリストの先頭に来るようになる
        nil.setNext(newNode);
        // nil の次のノードを新しく作成したノード newNode に設定する
        // これにより、newNode がリストの新しい先頭ノードとなる
    }
    // このメソッドにより、新しいノードがリストの先頭に追加され、リストの他のノードと適切に接続される
}