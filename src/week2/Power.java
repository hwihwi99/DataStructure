package week2;

public class Power {
    public long power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        long y = 0;

        if(n % 2 == 1) { // n이 홀수일 때
            y = power(x, (n-1)/2);
            return x * y * y;
        }else { // n이 짝수일 때
            y = power(x, n/2);
            return y * y;
        }
    }
}
