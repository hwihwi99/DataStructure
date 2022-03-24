package week3;

import java.util.EmptyStackException;

public class StackQueue implements Queue{

    ArrayStack inStack;
    ArrayStack outStack;

    public StackQueue(int n) {
        inStack = new ArrayStack(n);
        outStack = new ArrayStack(n);
    }

    @Override
    public int size() {
        return inStack.size() + outStack.size();
    }

    @Override
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    @Override
    public char front() throws Exception {
        for(int i = 0; i< inStack.size(); i++) {
            char c = inStack.pop();
            outStack.push(c);
        }
        return outStack.top();
    }

    @Override
    public void enqueue(char o) throws Exception {
        inStack.push(o);
    }

    @Override
    public char dequeue() throws Exception {
        if(isEmpty()){
            throw new EmptyStackException();
        }

        if(outStack.isEmpty()){
            int l = inStack.size();
            for(int i = 0; i < l; i++) {
                char c = inStack.pop();
                outStack.push(c);
            }
        }

        return outStack.pop();
    }

    public static void main(String[] args) throws Exception {
        StackQueue stackQueue = new StackQueue(10);
        stackQueue.enqueue('a');
        stackQueue.enqueue('b');
        stackQueue.enqueue('c');
        stackQueue.enqueue('d');
        stackQueue.enqueue('e');

        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();

        stackQueue.enqueue('f');
        stackQueue.enqueue('g');
        stackQueue.enqueue('h');
        stackQueue.enqueue('i');
        stackQueue.enqueue('j');

        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();

        stackQueue.enqueue('k');
        stackQueue.enqueue('l');
        stackQueue.enqueue('m');
        stackQueue.enqueue('n');
        stackQueue.enqueue('o');

        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.dequeue();

        StringBuilder stringBuilder = new StringBuilder();

        while (!stackQueue.isEmpty()) {
            stringBuilder.append(stackQueue.dequeue()).append(' ');
        }

        System.out.println(stringBuilder);

    }
}
