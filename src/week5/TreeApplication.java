package week5;

import week5.MyBinTree;

public class TreeApplication {

    public static void main(String[] args) throws Exception {
        MyBinTree myBinTree = new MyBinTree('+');
        myBinTree.addNode("X");
        myBinTree.addNode("X");
        myBinTree.insertLeft(myBinTree.root().left(),"2");
        myBinTree.insertRight(myBinTree.root().left(),"-");
        myBinTree.insertLeft(myBinTree.root().left().right(),"3");
        myBinTree.insertRight(myBinTree.root().left().right(),"1");
        myBinTree.insertLeft(myBinTree.root().right(),"3");
        myBinTree.insertRight(myBinTree.root().right(),"2");

        myBinTree.inorder(myBinTree.root());

    }
}
