package problemSolving.subarray;

import java.util.Set;

public class MaxVowels {

    public static void main(String[] args) {

        System.out.println(maxVowels("abciiidef", 3));  // 3
        System.out.println(maxVowels("aeiou", 2));      // 2
        System.out.println(maxVowels("xyz", 2));        // 0


    }

    private static int maxVowels(String word, int k) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int max, count = 0;

        for(int i=0; i < k;i++){
            if(vowels.contains(word.charAt(i))) count++;
        }
        max = count;

        for(int right = k; right < word.length(); right++){
            char added = word.charAt(right);
            char removed = word.charAt(right - k);

            if(vowels.contains(added)) count++;
            if(vowels.contains(removed)) count--;

            max = Math.max(max, count);
        }

        return max;




    }

}
