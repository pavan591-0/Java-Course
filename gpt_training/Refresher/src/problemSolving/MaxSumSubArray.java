package problemSolving;

public class MaxSumSubArray {

    public static void main(String[] args){

        maxSumSubArrayWithK(new int[]{2,3,5,1,6}, 3);
        maxSumSubArrayWithK(new int[]{1,1,1,1,1}, 2);
        maxSumSubArrayWithK(new int[]{5,2,1,7,3,9}, 2);

    }

    private static void maxSumSubArrayWithK(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i = 0; i< k; i++){
            windowSum += arr[i];
        }

        for(int i=k;i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];
            max = Math.max(max, windowSum);
        }

        System.out.println("Maximum with sub Array of length "+k+" is: "+max);
    }

}
