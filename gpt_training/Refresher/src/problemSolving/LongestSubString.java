package problemSolving;

import java.util.*;

public class LongestSubString {

    public static void main(String[] args){

        System.out.println("Length: "+longestSubStringLength("abcabcbb"));
        System.out.println("Length: "+longestSubStringLength("bbbbb"));
        System.out.println("Length: "+longestSubStringLength("pwwkew"));
        System.out.println("Length: "+longestSubStringLength(""));
        System.out.println("Length: "+longestSubStringLength("a"));
        System.out.println("Length: "+longestSubStringLength("dvdf"));

    }

    private static int longestSubStringLength(String word) {
        int len = word.length();
        int max = 0;
        int left = 0;

        if(len == 1) return 1;
        else if(len < 1) return -1;

        Set<Character> subStr = new HashSet<>();

        for(int right = 0; right < word.length(); right++){
            while(subStr.contains(word.charAt(right))){
                subStr.remove(word.charAt(left));
                left++;
            }
            subStr.add(word.charAt(right));
            max = Math.max(max, subStr.size());
        }
        return max;
    }
}
