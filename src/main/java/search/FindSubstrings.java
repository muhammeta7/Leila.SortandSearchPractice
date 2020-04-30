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

    public static void main(String[] args) {
        String[] test = getAllSubstrings("Animal");
        for(String s : test){
            System.out.println(s);
        }
    }


}
