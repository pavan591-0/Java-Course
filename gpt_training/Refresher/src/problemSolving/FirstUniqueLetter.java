package problemSolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueLetter {

    public static void main(String[] args) {

        String s1 = "aaabbbc";
        String s2 = "leetcode";
        String s3 = "a";
        String s4 = "aabb";
        System.out.println("Index: "+ indexOfUniqueFirstLetter(s1));
        System.out.println("Index: "+ indexOfUniqueFirstLetter(s2));
        System.out.println("Index: "+ indexOfUniqueFirstLetter(s3));
        System.out.println("Index: "+ indexOfUniqueFirstLetter(s4));
    }

    private static int indexOfUniqueFirstLetter(String word) {

        Map<Character, Integer> frequencies = new LinkedHashMap<>();

        for(int i=0; i< word.length(); i++){
            char ch = word.charAt(i);
            if(frequencies.containsKey(ch)){
                frequencies.put(ch, frequencies.get(ch) + 1);
            }
            else{
                frequencies.put(ch, 1);
            }
        }

        for(Character c: frequencies.keySet()){
            if(frequencies.get(c) == 1) return word.indexOf(c);
        }

        return -1;

    }

}

// better solution:
// private static int firstUniqueChar(String s) {
//    Map<Character, int[]> map = new LinkedHashMap<>();
//
//    for (int i = 0; i < s.length(); i++) {
//        char c = s.charAt(i);
//
//        if (map.containsKey(c)) {
//            map.get(c)[0]++;           // increase count
//        } else {
//            map.put(c, new int[]{1, i}); // {count=1, index=i}
//        }
//    }
//
//    for (Map.Entry<Character, int[]> entry : map.entrySet()) {
//        if (entry.getValue()[0] == 1) {
//            return entry.getValue()[1]; // return stored index
//        }
//    }
//
//    return -1;
//}


