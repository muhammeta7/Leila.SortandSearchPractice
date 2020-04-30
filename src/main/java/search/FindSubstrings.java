package search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindSubstrings {

    public static String[] getAllSubstrings(String s){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1 ; j <= s.length() ; j++) {
                result.add(s.substring(i,j));
            }
        }
        return result.stream().toArray(String[]::new);

    }

    public static int countFrowns(String input){
        int counter = 0;
        input.split("");
        while(input != null){
            if(input.matches("")){
                counter++;
            }
        }
        System.out.println(input);
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        String[] test = getAllSubstrings("Animal");
        for(String s : test){
            System.out.println(s);
        }
        countFrowns("Someone I know :o) recently combined Maple Syrup :'D & buttered Popcorn 8~C thinking it would taste like caramel popcorn >;'@. It didn’t :-< and they don’t recommend anyone ;{ else do it either :o@ :o3");
    }


}
