package week1;
/**
 * 버블정렬은 앞에서부터 계속해서 반복하며 돕니다.
 * 이 때 한번 큰 FOR문을 돌때마다 가장 큰 원소를 맨 뒤로 가져갑니다.
 * */
public class BubbleSort {
    public static void bubleSort(int []arr) {
        for(int i =0; i<arr.length; i++) {
            for(int j = 0; j <arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
