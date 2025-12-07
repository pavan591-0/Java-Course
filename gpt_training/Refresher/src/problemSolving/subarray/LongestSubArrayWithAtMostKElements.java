package problemSolving.subarray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithAtMostKElements {

    public static void main(String[] args) {
        int[] a1 = {1,2,1,2,3};
        int[] a2 = {1,2,1,3,4};
        int[] a3 = {1,1,1};
        int[] a4 = {2,4,2,5,3,3};

        System.out.println(subArrayWithAtMostKDistinct(a1, 2));
        System.out.println(subArrayWithAtMostKDistinct(a2, 2));
        System.out.println(subArrayWithAtMostKDistinct(a3, 3));
        System.out.println(subArrayWithAtMostKDistinct(a4, 2));
    }

    private static int subArrayWithAtMostKDistinct(int[] arr, int k) {

        int left = 0;
        int max = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int right=0; right< arr.length; right++){
            freq.put(arr[right], freq.getOrDefault(arr[right], 0)+1);
            while(freq.size() > k){
                freq.put(arr[left], freq.get(arr[left]) -1);
                if(freq.get(arr[left]) == 0) freq.remove(arr[left]);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
