package week5;

public class MyTreePreorder {
    public static void predrder(MyNode myNode, int depth) {
        if(myNode == null) {
            return;
        }
        for(int i = 0; i<depth; i++) {
            System.out.print("    ");
        }
        System.out.println(myNode.element());
        depth++;
        if(myNode.children() != null) {
            for(Object node : myNode.children()) {
                predrder((MyNode) node, depth);
            }
        }
    }
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        MyNode root = tree.addRoot("Make Money Fast!");

        MyNode motivate = tree.addNode("1. Motivations");
        MyNode methods = tree.addNode("2. Methods");
        MyNode references = tree.addNode("References");

        MyNode greed = tree.addChild(motivate, "1.1 Greed");
        MyNode avidity = tree.addChild(motivate, "1.2 Avidity");

        MyNode stock = tree.addChild(methods, "2.1 Stock Fraud");
        MyNode ponzi = tree.addChild(methods, "2.2 Ponzi Scheme");
        MyNode bank = tree.addChild(methods, "2.3 Bank Robbery");

        predrder(root,0);
    }

}
