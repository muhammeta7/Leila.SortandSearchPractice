package integer;

public class ReverseInteger {

    public static int reverseInt(int input){
        int rev = 0;
        while (input != 0) {
            rev = rev * 10 + input % 10;
            input /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.print(reverseInt(54321));
    }

}
