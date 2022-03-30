package week4;

public class MyArrayList {

    private Object[] arrayList;
    private int top;
    public MyArrayList(int N) {
        arrayList = new Object[N];
        top = 0;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public Object get(int i) throws Exception {
        if(i >= top || i < 0) {
            throw new Exception("해당 인덱스에 접근할 수 없습니다.(리스트 범위에서 벗어났습니다.)");
        }
        return arrayList[i];
    }

    public Object set(int i, Object e) throws Exception {
        if(i >= top || i < 0) {
            throw new Exception("해당 인덱스에 접근할 수 없습니다.(리스트 범위에서 벗어났습니다.)");
        }
        Object oldElement = arrayList[i];
        arrayList[i] = e;
        return oldElement;
    }

    public void add(int i, Object e) throws Exception {
        if(i > top || i < 0) {
            throw new Exception("해당 인덱스에 접근할 수 없습니다.(리스트 범위에서 벗어났습니다.)");
        }
        for(int j = top; j>i; j--) {
            arrayList[j] = arrayList[j-1];
        }
        arrayList[i] = e;
        top++;
        if(top >= arrayList.length) {
            Object[] temp = new Object[arrayList.length * 2];
            for(int k = 0; k<arrayList.length; k++) {
                temp[k] = arrayList[k];
            }
            arrayList = temp;
        }

    }

    public Object remove(int i) throws Exception {
        if(i >= top || i < 0) {
            throw new Exception("해당 인덱스에 접근할 수 없습니다.(리스트 범위에서 벗어났습니다.)");
        }
        Object oldElement = arrayList[i];
        for(int j = i+1; j<top;j++) {
            arrayList[j-1] = arrayList[j];
        }
        top--;
        return oldElement;
    }
}
