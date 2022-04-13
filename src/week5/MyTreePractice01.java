package week5;

public class MyTreePractice01 {
    public static void main(String[] args) throws Exception {
        MyTree myTree = new MyTree();

        MyNode root = myTree.addRoot("Computers'R Us");

        MyNode sale = myTree.addNode("Sales");
        MyNode manufacturing = myTree.addNode("Manufacturing");
        MyNode rd = myTree.addNode("R&D");

        MyNode us = myTree.addChild(sale,"US");
        MyNode international = myTree.addChild(sale,"International");

        MyNode laptops = myTree.addChild(manufacturing,"Laptops");
        MyNode desktops = myTree.addChild(manufacturing, "Desktops");

        MyNode europe = myTree.addChild(international,"Europe");
        MyNode asia = myTree.addChild(international,"Asia");
        MyNode canada = myTree.addChild(international,"Canada");

        System.out.println("[Level 0]");
        System.out.println(root.element());
        System.out.println();

        System.out.println("[Level 1]");
        StringBuilder sb = new StringBuilder();
        sb.append(sale.element()).append(", ");
        sb.append(manufacturing.element()).append(", ");
        sb.append(rd.element());
        System.out.println(sb);
        System.out.println();

        System.out.println("[Level 2]");
        sb = new StringBuilder();
        sb.append(us.element()).append(", ");
        sb.append(international.element()).append(", ");
        sb.append(laptops.element()).append(", ");
        sb.append(desktops.element());
        System.out.println(sb);
        System.out.println();

        System.out.println("[Level 3]");
        sb = new StringBuilder();
        sb.append(europe.element()).append(", ");
        sb.append(asia.element()).append(", ");
        sb.append(canada.element());
        System.out.println(sb);
        System.out.println();

        System.out.printf("* Tree size = Total %d Nodes\n", myTree.size());


    }
}
