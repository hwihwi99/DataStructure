package week2;

public class BinarySum {
    public int binarySum (int[] A, int i, int n) {
        if(n == 1) { // 배열에 갯수가 한개 남았다면 해당 인덱스에 있는 배열 원소 리턴
            return A[i];
        } else {
            return binarySum(A,i,(int) Math.ceil((float)n/2)) + binarySum(A, i+(int) Math.ceil((float)n/2), n/2);
        }
    }
}
