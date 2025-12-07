package problemSolving.subarray;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKDistinct {

    public static void main(String[] args) {

        int[] a1 = {1,2,1,2,3};  // k=2 → 7
        int[] a2 = {1,2,1,3,4};  // k=3 → 3
        int[] a3 = {1,1,1,1};    // k=1 → 10
        int[] a4 = {2,4,2,5,3,3}; // k=2 → 8

        System.out.println(countSubarraysWithKDistinct(a1, 2));
        System.out.println(countSubarraysWithKDistinct(a2, 3));
        System.out.println(countSubarraysWithKDistinct(a3, 1));
        System.out.println(countSubarraysWithKDistinct(a4, 2));

    }

    public static int countSubarraysWithKDistinct(int[] arr, int k) {
        return atMostKDistinct(arr, k) - atMostKDistinct(arr, k - 1);
    }

    private static int atMostKDistinct(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            frequencyMap.put(arr[right], frequencyMap.getOrDefault(arr[right], 0)+1);

            while(frequencyMap.size() > k){
                frequencyMap.put(arr[left], frequencyMap.get(arr[left]) - 1);
                if(frequencyMap.get(arr[left]) == 0) frequencyMap.remove(arr[left]);
                left++;
            }
            count += (right-left + 1);
        }
        return count;
    }


}
