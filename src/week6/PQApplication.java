package week6;

import java.util.Comparator;

class PointComparator implements Comparator {
    public int compare(Object o1, Object o2){
        return (int)o1 - (int)o2;
    }
}

class PointComparator2 implements Comparator {
    public int compare(Object o1, Object o2){
        return (int)o2 - (int)o1;
    }
}

class Point{
    String name;
    int x;
    int y;
    int dis;
    Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.dis = x*x + y*y;
    }
    String print(){
        return name+" ("+x+", "+y+")";
    }
}

public class PQApplication {
    public static void main(String[] args) {

        Point p1 = new Point("a",5,4);
        Point p2 = new Point("b",2,7);
        Point p3 = new Point("c",9,5);
        Point p4 = new Point("d",3,1);
        Point p5 = new Point("e",7,2);
        Point p6 = new Point("f",9,7);
        Point p7 = new Point("g",1,4);
        Point p8 = new Point("h",4,3);
        Point p9 = new Point("i",8,2);
        Point p10 = new Point("j",4,8);

        PointComparator c1 = new PointComparator();
        MyPQ myPQ1 = new MyPQ(c1);

        myPQ1.insert(p1.dis,p1.print());
        myPQ1.insert(p2.dis,p2.print());
        myPQ1.insert(p3.dis,p3.print());
        myPQ1.insert(p4.dis,p4.print());
        myPQ1.insert(p5.dis,p5.print());
        myPQ1.insert(p6.dis,p6.print());
        myPQ1.insert(p7.dis,p7.print());
        myPQ1.insert(p8.dis,p8.print());
        myPQ1.insert(p9.dis,p9.print());
        myPQ1.insert(p10.dis,p10.print());

        System.out.println("[가까운 순서]");
        while(!myPQ1.isEmpty()){
            System.out.println(myPQ1.removeMin().getValue());
        }

        System.out.println();

        PointComparator2 c2 = new PointComparator2();
        MyPQ myPQ2 = new MyPQ(c2);
        myPQ2.insert(p1.dis,p1.print());
        myPQ2.insert(p2.dis,p2.print());
        myPQ2.insert(p3.dis,p3.print());
        myPQ2.insert(p4.dis,p4.print());
        myPQ2.insert(p5.dis,p5.print());
        myPQ2.insert(p6.dis,p6.print());
        myPQ2.insert(p7.dis,p7.print());
        myPQ2.insert(p8.dis,p8.print());
        myPQ2.insert(p9.dis,p9.print());
        myPQ2.insert(p10.dis,p10.print());

        System.out.println("[멀리 있는 순서]");
        while(!myPQ2.isEmpty()){
            System.out.println(myPQ2.removeMin().getValue());
        }

    }
}
