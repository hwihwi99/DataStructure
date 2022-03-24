package week3;

public interface Stack {
    public int size();
    public boolean isEmpty();
    public char top();
    public void push(char o) throws Exception;
    public char pop();
}
