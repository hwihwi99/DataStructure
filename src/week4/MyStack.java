package week4;
/**
 * push, pop의 예외처리의 경우 MyArrayList에서 이미 구현하였습니다.
 * */
public class MyStack {
    private MyArrayList myArrayList;
    public MyStack(int n) {
        myArrayList = new MyArrayList(n);
    }

    public int size() {
        return myArrayList.size();
    }

    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    public Object top() throws Exception {
        return myArrayList.get(myArrayList.size()-1);
    }

    public void push(Object e) throws Exception {
        myArrayList.add(myArrayList.size(), e);
    }

    public Object pop() throws Exception {
        return myArrayList.remove(myArrayList.size()-1);
    }

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
