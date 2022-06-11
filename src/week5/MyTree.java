package week5;

import java.util.ArrayList;

public class MyTree {
    private MyNode root;
    private int size;
    public MyTree() {
        root = new MyNode();
        size = 0;
    }

    public MyTree(Object element) {
        root= new MyBinNode(element);
        root.setChildren(new ArrayList());
        size = 1;
    }

    public int size() {
        return size;
    }

    public MyNode root() {
        return root;
    }

    public ArrayList children(MyNode v) {
        return v.children();
    }

    public boolean isExternal(MyNode v) {
        return v.children().size() == 0;
    }

    public MyNode addRoot(Object e) { // 루트 노드 추가 -> 기존 루트노드에서 추가
        MyNode newRoot = new MyNode(e);
        root.setParent(newRoot);

        ArrayList newRootChild = new ArrayList();
        newRoot.setChildren(newRootChild);
        root = newRoot;
        size++;
        return newRoot;
    }

    public MyNode addNode(Object e) throws Exception { // 기존 루트 노드에 새로운 자식 추가
        MyNode newChild = new MyBinNode(e);
        ArrayList newChildArray = new ArrayList();
        newChild.setChildren(newChildArray);
        root.children().add(newChild);
        newChild.setParent(root);
        size++;
        return newChild;
    }

    public MyNode addChild(MyNode v, Object e) { // v노드 자식으로 넣기
        MyNode newChild = new MyNode(e);
        ArrayList newChildArray = new ArrayList();
        newChild.setChildren(newChildArray);
        v.children().add(newChild);
        newChild.setParent(v);
        size++;
        return newChild;
    }

    public MyNode addChild(MyNode v, Object e, int fileSize) { // v노드 자식으로 넣기
        MyNode newChild = new MyNode(e,fileSize);
        ArrayList newChildArray = new ArrayList();
        newChild.setChildren(newChildArray);
        v.children().add(newChild);
        newChild.setParent(v);
        size++;
        return newChild;
    }

    public MyNode addChild(MyNode v, int i ,Object e) throws Exception { // v노드에 i번째에 자식으로 넣기
        // 만약 i번째 인덱스가 없다면 예외처리
        if(v.children().size() < i || i <0) {
            throw new Exception(i+"번째 인덱스에 값을 추가할 수 없습니다.");
        }
        MyNode newChild = new MyBinNode(e);
        ArrayList newChildArray = new ArrayList();
        newChild.setChildren(newChildArray);
        v.children().add(i, newChild);
        newChild.setParent(v);
        size++;
        return newChild;
    }

    public MyNode setChild(MyNode v, int i, Object e) throws Exception { // v의 i번째 자식의 값을 e로 바꾼다.
        // 만약 i번째 인덱스가 없다면 예외처리
        if(v.children().size()-1 < i || i <0) {
            throw new Exception(i+"번째 인덱스를 찾을 수 없습니다. (값 변경 불가)");
        }
        MyNode updateNode = (MyNode) v.children().get(i);
        updateNode.setElement(e);
        return updateNode;
    }

    public MyNode removeChild(MyNode v, int i ) throws Exception {
        // 만약 i번째 인덱스가 없다면 예외처리
        if(v.children().size()-1 < i || i <0) {
            throw new Exception(i+"번째 인덱스를 찾을 수 없습니다. (삭제 불가)");
        }
        MyNode deleteNode = (MyNode) v.children().remove(i);
        size --;
        return deleteNode;
    }

}
