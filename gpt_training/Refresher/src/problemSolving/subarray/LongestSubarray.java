package problemSolving.subarray;

public class LongestSubarray {

    public static void main(String[] args){

        longestSubarrayWithSumK(new int[]{2, 1, 1, 1, 3, 2}, 4);
        longestSubarrayWithSumK(new int[]{1,2,3}, 3);
        longestSubarrayWithSumK(new int[]{5,1,1,1,1}, 5);
        longestSubarrayWithSumK(new int[]{1,1,1,1}, 10);
        longestSubarrayWithSumK(new int[]{4,2,1,1,1}, 3);

    }

    private static void longestSubarrayWithSumK(int[] arr, int k) {
        int left = 0;
        int total = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int right = 0; right  < arr.length; right++){
            total += arr[right];

            while(total > k){
                total -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, (right - left)+1);
        }

        System.out.println(maxLen);

    }

}
