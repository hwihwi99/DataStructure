package week3;

import java.util.EmptyStackException;

public class ArrayStack implements Stack{

    private char[] myStack;
    private int top;

    public ArrayStack(int n) {
        myStack = new char[n];
        top = -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public char top() {
        if(isEmpty()) { //비었다면?
            throw new EmptyStackException();
        }
        return myStack[top];
    }

    @Override
    public void push(char o) throws Exception {
        if(top == myStack.length-1) {
            throw new Exception("stack is full");
        }
        top++;
        myStack[top] = o;
    }

    @Override
    public char pop() {
        if(isEmpty()) { //비었다면?
            throw new EmptyStackException();
        }
        char remove = myStack[top];
        top--;
        return remove;
    }
}
