package week3;

public interface Queue {
    public int size();
    public boolean isEmpty();
    public char front() throws Exception;
    public void enqueue(char o) throws Exception;
    public char dequeue() throws Exception;
}
