package problemSolving.basic;

import java.util.Arrays;

public class KadanesAlgorithm {

    public static void main(String[] args){

        maxSumSubArray(new int[]{5, -1, 3, -2, 8});
        maxSumSubArray(new int[]{-2, -3, -1, -4});
        maxSumSubArray(new int[]{1, 2, 3, 4});
        maxSumSubArray(new int[]{4, -2, -3, 4, 1});


    }

    private static void maxSumSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int highestNum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i: arr){
            currSum += i;
            max = Math.max(currSum, max);
            highestNum = Math.max(highestNum, i);
            if(currSum < 0) currSum = 0;
        }
        if(max < 0) max = highestNum;
        System.out.println(Arrays.toString(arr)+ " and the max sum with n length subarray is: "+max);
    }

}
