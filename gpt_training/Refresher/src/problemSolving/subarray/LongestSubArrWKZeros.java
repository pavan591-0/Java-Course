package problemSolving.subarray;

public class LongestSubArrWKZeros {

    public static void main(String[] args){

        System.out.println(longestSubarrayAtMostKZeros(new int[]{1, 0, 1, 1, 0, 1, 0, 1}, 2));
        System.out.println(longestSubarrayAtMostKZeros(new int[]{1, 1, 1, 1}, 2));
        System.out.println(longestSubarrayAtMostKZeros(new int[]{0, 0, 0, 0}, 1));
        System.out.println(longestSubarrayAtMostKZeros(new int[]{1, 0, 1, 0, 1, 0, 1}, 3));
        System.out.println(longestSubarrayAtMostKZeros(new int[]{1}, 0));

    }

    private static int longestSubarrayAtMostKZeros(int[] arr, int k){
        int left = 0,count = 0;
        int result = Integer.MIN_VALUE;
        for(int right=0; right < arr.length; right++){
            if(arr[right] == 0){
                count++;
                while(count > k){
                    if(arr[left] == 0) count--;
                    left++;
                }
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }


}
