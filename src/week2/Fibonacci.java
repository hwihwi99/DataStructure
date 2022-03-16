package week2;

import java.math.BigInteger;

public class Fibonacci {
    private static int k = 0;
    public BigInteger[] linearFib(int n) {
        if(n <= 1) {
            BigInteger[] bigIntegers = {BigInteger.valueOf(n),BigInteger.valueOf(0)};
            System.out.println(k+"번 째 수 : " + bigIntegers[1]);
            System.out.println((k+1)+"번 째 수 : " + bigIntegers[0]);
            k = 2;
            return bigIntegers;
        }
        else {
            BigInteger[] fibbonacci = linearFib(n-1);
            BigInteger[] answer = {fibbonacci[0].add(fibbonacci[1]), fibbonacci[0]};
            System.out.println(k+"번 째 수 : " +answer[0]);
            k++;
            return answer;
        }
    }
}
