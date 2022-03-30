package week4;
/**
 * enqueue, dequeue의 예외처리는 MyArrayList에서 이미 구현하였습니다.
 * */
public class MyQueue {
    private MyArrayList myArrayList;

    public MyQueue(int n) {
        myArrayList = new MyArrayList(n);
    }

    public int size() {
        return myArrayList.size();
    }

    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    public Object front() throws Exception {
        return myArrayList.get(0);
    }

    public Object dequeue() throws Exception {
        return myArrayList.remove(0);
    }

    public void enqueue(Object e) throws Exception {
        myArrayList.add(myArrayList.size(), e);
    }

    public static void main(String[] args) throws Exception {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.enqueue(10);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}


