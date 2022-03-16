package week2;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        /**
         * 실습 1. power 함수를 이용해서 5^16을 구하시오.
         * */
        Power power = new Power();
        System.out.println("5^16 값을 구하시오 : " + power.power(5,16));

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        /**
         * 실습 2. binarySum 함수를 이용해서 1~100까지 숫자를 합산하시오.
         * */
        BinarySum binarySum = new BinarySum();
        int[] arr = new int[100];
        for(int i = 0; i<100; i++) {
            arr[i] = i+1;
        }
        System.out.println("1~100까지 숫자 합 : " + binarySum.binarySum(arr,0,100));

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        /**
         * 실습 3. linearFib 함수를 이용해서 100번째 수열까지 출력하는 프로그램
         * */
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.linearFib(100);

    }
}
