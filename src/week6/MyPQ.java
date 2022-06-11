package week6;

import java.util.ArrayList;
import java.util.Comparator;

class IntComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return (int)o1 - (int)o2;
    }
}
public class MyPQ {

    private ArrayList<MyEnrty> priorityQueue;
    private Comparator comparator;

    MyPQ(Comparator comp) {
        this.comparator = comp;
        this.priorityQueue = new ArrayList<>();
    }

    MyPQ(int initialCapacity, Comparator comp) {
        this.comparator = comp;
        this.priorityQueue = new ArrayList<>(initialCapacity);
    }

    public int size() {
        return priorityQueue.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public MyEnrty insert(Object k, Object v) {
        MyEnrty newMyEntry = new MyEnrty(k,v);

        int where = 0;
        for(int i = 0; i< priorityQueue.size(); i++) {
            MyEnrty tempEntry = priorityQueue.get(i);
            if(this.comparator.compare(k, tempEntry.getKey()) > 0) {
                where++;
            }
        }
        priorityQueue.add(where,newMyEntry);
        return newMyEntry;
    }

    public MyEnrty removeMin() {
        if(isEmpty())
            return null;

        MyEnrty removeEntry = priorityQueue.remove(0);
        return removeEntry;
    }

    public MyEnrty min() {
        if(isEmpty())
            return null;

        MyEnrty minEntry = priorityQueue.get(0);
        return minEntry;
    }

    public static void main(String[] args) {
        IntComparator c = new IntComparator();
        MyPQ pq = new MyPQ(c);

        pq.insert(new Integer(30), null);
        pq.insert(new Integer(10), null);
        pq.insert(new Integer(20), null);

        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());
        System.out.println((Integer)pq.removeMin().getKey());
    }
}
