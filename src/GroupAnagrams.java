import java.util.*;



public class GroupAnagrams {


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (final char c : s.toCharArray())
            ++count[c - 'a'];

        for (final char c : t.toCharArray()) {
            if (count[c - 'a'] == 0)
                return false;
            --count[c - 'a'];
        }

        return true;
    }





    public static void main(String[] args) {}


}
