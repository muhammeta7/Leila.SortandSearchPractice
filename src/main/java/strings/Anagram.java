package strings;

public class Anagram {

    // Determine whether 2 strings are anagrams
    public boolean isAnagram(String s1, String s2) {
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        int sum = 0;
        for(int i = 0; i<s1.length() ; i++){
            sum += Math.pow(((int)str1.charAt(i)),2);
            sum -= Math.pow(((int)str2.charAt(i)),2);
        }

        return sum == 0;
    }


}
