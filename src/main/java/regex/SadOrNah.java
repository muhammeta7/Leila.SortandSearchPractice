package regex;

public class SadOrNah {
    // Programming challenge description:
//    Write a program to count the total number of frowny smileys in a string.
//    Here are the rules for how to find smileys and determine whether they are happy or frowny:
//    Optionally, a smiley may start with eyebrows. Eyebrows are marked with the character >.
//    Each smiley must have a pair of eyes. The characters used for eyes are :, ;, or 8.
//    Using only eyes, it's difficult to determine whether a smiley is happy or not. So you need to proceed further with the analysis.
//    Optionally, a smiley may cry. Any tears must follow the eyes and are marked with the character '.
//    But be careful, they could be tears of happiness.
//    Optionally, a smiley may have a nose marked with -, o or ~.
//    The last and most evident sign of the smiley's mood is its mouth.
//    A frowny smiley has a mouth marked with one of these characters: (, C, <, [, {, or @.
//    The distinguishing feature of a happy smiley face is a mouth marked with ), ], }, D, or 3.
//    Each smiley starts with eyebrows or eyes and ends with the mouth.
    public static int printFrownCount(String input){
        int counter = 0;
        String[] word = input.split(" ");
        for(String s : word){
            if(s.matches(".*[@<C{\\[ \\\\( ].*")){
                System.out.println(s);
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(printFrownCount(":~( Someone I know :o) recently combined Maple Syrup :'D & buttered Popcorn 8~C thinking it would taste like caramel popcorn >;'@. It didn’t :-< and they don’t recommend anyone ;{ else do it either :o@ :o3"));
    }




}

