package other;

public class Fibonacci {

    // Possible method layout
    // - Return an int array of Fibonacci sequence where all numbers are smaller than n
    // = Return an int array of Fibonacci sequence from range a to b
    public int[] printFibonacci(int form, int to){
        return null;
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static int fibNonRecursive(int n){
        int[]  fibo= new int[n+2];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n ; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(30));
        System.out.println(fibNonRecursive(30));

    }

}

