package week5;

import java.util.ArrayList;

public class MyNode {
    private Object element;
    private MyNode parent;
    private ArrayList children;
    private int fileSize;

    public MyNode() {
        element = null;
        parent = null;
        children = null;
        fileSize = 0;
    }

    public MyNode(Object e) {
        this.element = e;
        this.parent = null;
        this.children = null;
        this.fileSize = 0;
    }

    public MyNode(Object e, int fileSize) {
        this.element = e;
        this.parent = null;
        this.children = null;
        this.fileSize = fileSize;
    }

    public Object element() {
        return element;
    }

    public MyNode parent() {
        return parent;
    }

    public ArrayList children() {
        return children;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int degree() {
        // 현재 노드의 자식 수
        return children.size();
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setParent(MyNode parent) {
        this.parent = parent;
    }

    public void setChildren(ArrayList children) {
        this.children = children;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
