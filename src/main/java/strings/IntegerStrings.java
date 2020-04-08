package strings;

public class IntegerStrings {

    // given two strings of integers, return me the string which is of
    // greater value (no using BigInteger or BigDecimal or parseInt)
    // valueOf not allowed

    public static String returnLargerValue(String int1, String int2){
        if( stringToInt(int1) < stringToInt(int2) ){
            return int2;
        } else {
            return int1;
        }
    }


    public static int stringToInt(String s){
        boolean isNegative = false;
        int number = 0;
        if( s.charAt(0) == '-'){
            isNegative = true;
        } else {
            number = number * 10 + s.charAt(0) -'0';
        }

        for (int i = 1; i < s.length(); i++) {
            number = number * 10 + s.charAt(i) - '0';
        }
        if(isNegative){
            number = -number;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(stringToInt("2984849"));
        System.out.println(returnLargerValue("00023", "9823"));
        System.out.println(returnLargerValue("9898", "8828"));
        System.out.println(returnLargerValue("-9898", "-0828"));
        System.out.println(returnLargerValue("872.023", "872.050"));
        System.out.println(returnLargerValue("8777", "8778"));
        System.out.println(returnLargerValue("-872.023", "-87.2050"));
        System.out.println(returnLargerValue( "8777", "877"));
        System.out.println(returnLargerValue("-.050", "-.002"));
    }

}
