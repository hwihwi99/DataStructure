package week5;

class TwoChildrenException extends Exception{
    TwoChildrenException(String message) {
        super(message);
    }
}

class NotExternalException extends Exception{
    NotExternalException(String message) {
        super(message);
    }
}
public class MyBinTree extends MyTree {
    public MyBinTree() {
        super();
    }

    public MyBinTree(Object e) {
        super(e);
        super.root().children().add(null);
        super.root().children().add(null);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isRoot(MyBinNode v) {
        return v.parent() == null;
    }

    public boolean hasLeft(MyBinNode v) {
        return v.children().get(0) != null;
    }

    public boolean hasRight(MyBinNode v) {
        return v.children().get(1) != null;
    }

    public boolean isInternal(MyBinNode v) {
        return !isExternal(v);
    }

    public boolean isExternal(MyBinNode v) {
        return !hasLeft(v) && !hasRight(v);
    }

    public MyBinNode root() {
        return (MyBinNode) super.root();
    }

    public MyBinNode parent(MyBinNode v) {
        return (MyBinNode) v.parent();
    }

    public MyBinNode left(MyBinNode v) {
        return (MyBinNode) v.children().get(0);
    }

    public MyBinNode right(MyBinNode v) {
        return (MyBinNode) v.children().get(1);
    }

    public MyBinNode addRoot(Object e) {
        MyBinNode root = (MyBinNode) super.addRoot(e);
        super.root().children().add(null);
        super.root().children().add(null);
        return root;
    }

    public MyBinNode addNode(Object e) throws Exception {
        MyBinNode newNode = null;
        if (hasLeft((MyBinNode) super.root()) && hasRight((MyBinNode) super.root())) {
            System.out.println("모든 루트 자식이 차있습니다.");
        } else if(hasLeft((MyBinNode)super.root())) { // 왼쪽에 있으니 오른쪽에 추가
            super.removeChild(super.root(),1);

            newNode = (MyBinNode) super.addNode(e);
            newNode.children().add(null);
            newNode.children().add(null);
        } else if(hasRight((MyBinNode)super.root())) { // 오른쪽에 있으니 왼쪽 채워주기
            MyBinNode temp = (MyBinNode) super.removeChild(super.root(),1);
            super.removeChild(super.root(),0);

            newNode = (MyBinNode) super.addNode(e);
            newNode.children().add(null);
            newNode.children().add(null);

            MyBinNode reRight = (MyBinNode) super.addNode(temp);
            reRight.children().add(null);
            reRight.children().add(null);
        } else {
            super.removeChild(super.root(),0);
            super.removeChild(super.root(),0);

            newNode = (MyBinNode) super.addNode(e);
            newNode.children().add(null);
            newNode.children().add(null);

            super.root().children().add(null);
        }
        return newNode;
    }

    public MyBinNode insertLeft(MyBinNode v, Object e) throws Exception {
        if(this.hasLeft(v)) {
            return null;
        }
        MyBinNode node = (MyBinNode) addChild(v,0,e);
        node.children().add(null);
        node.children().add(null);
        return node;
    }

    public MyBinNode insertRight(MyBinNode v, Object e) throws Exception {
        if(this.hasRight(v)) {
            return null;
        }
        MyBinNode node = (MyBinNode) addChild(v,1,e);
        node.children().add(null);
        node.children().add(null);
        return node;
    }

    public Object replace(MyBinNode v, Object e) {
        Object tempElement = v.element();
        v.setElement(e);
        return tempElement;
    }

    public MyBinNode remove(MyBinNode v) throws TwoChildrenException {
        // 지우려고 하는 애의 부모 노드를 구한다.
        MyBinNode parent = (MyBinNode) v.parent();
        int idx = 0; // 0이면 현재 지우려고 하는게 왼쪽, 1이면 오른쪽
        if(right(parent) == v) {
            idx = 1;
        }

        if(hasRight(v) && hasLeft(v)) { // 지우려고 하는 애의 자식이 모두 있을 때
            throw new TwoChildrenException("자식이 두개라서 삭제 불가합니다.");
        } else if(hasLeft(v)) { // 왼쪽에만 자식이 있을 때
            MyBinNode children = (MyBinNode) v.children().get(0);
            parent.children().set(idx,children);
            children.setParent(parent);
        } else if(hasLeft(v)) { // 왼쪽에만 자식이 있을 때
            MyBinNode children = (MyBinNode) v.children().get(1);
            parent.children().set(idx, children);
            children.setParent(parent);
        } else {
            parent.children().set(idx,null);
        }
        return v;
    }

    public void attach(MyBinNode v, MyBinNode t1, MyBinNode t2) throws Exception {
        if(isExternal(v)) {
            insertLeft(v,t1.element());
            insertRight(v,t2.element());
        } else {
            throw new NotExternalException("attach할 수 없는 노드입니다.");
        }
    }

    public void inorder(MyBinNode v) {
        if(hasLeft(v)){
            System.out.print("(");
            inorder(v.left());
        }
        System.out.print(v.element());
        if(hasRight(v)){
            System.out.println(")");
            inorder(v.right());
        }
    }
}
