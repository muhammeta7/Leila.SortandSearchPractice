package search;

public class FindPrime {

    //Possible method layout
    // - Returning all prime that’s small than n
    // - Return n primes, ascending, starting from 2
    // - Check if n is prime... etc

    public int[] getPrime(int from, int to){


        return null;
    }

    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if( n % i == 0){
                return false;
            }
        }

        return true;
    }

}
