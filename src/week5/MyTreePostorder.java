package week5;

public class MyTreePostorder {
    public static void postorder(MyNode node) {
        if(node == null) {
            return;
        }
        int totalSize = 0;
        if(node.children() != null) {
            for(Object child : node.children()) {
                postorder((MyNode) child);
                totalSize += ((MyNode) child).getFileSize();
            }
        }
        if(node.getFileSize() == 0) {
            System.out.println(node.element()+" = "+totalSize+"KB");
            node.setFileSize(totalSize);
        }
    }

    public static void main(String[] args) throws Exception {
        MyTree tree = new MyTree("cs16/");

        MyNode homework = tree.addNode("homeworks/");
        MyNode program = tree.addNode("programs/");
        MyNode todod = tree.addChild(tree.root(),"todo.txt", 1);

        MyNode h1c = tree.addChild(homework,"h1c.doc",3);
        MyNode h1nc = tree.addChild(homework,"h1nc.doc",2);
        MyNode ddr = tree.addChild(program,"DDR.java",10);
        MyNode stock = tree.addChild(program,"Stocks.java",25);
        MyNode robot = tree.addChild(program,"Robot.java",20);

        postorder(tree.root());
    }
}
