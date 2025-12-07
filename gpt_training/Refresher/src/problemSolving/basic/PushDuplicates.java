package problemSolving.basic;

import java.util.Arrays;

/**
 * Input:
 * [1,1,2,2,2,3,4,4]
 * Output:
 * [1,2,3,4]
 * Rules:
 * In-place
 * Use two pointers (i, j)
 * Don’t use extra list
 * Return the new length
 * */

public class PushDuplicates {
    public static void main(String[] args) {
        swapDuplicates(new int[]{1,1,2,2,2,3,4,4});
        swapDuplicates(new int[]{1,2,3,4});
        swapDuplicates(new int[]{1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4});
    }

    private static void swapDuplicates(int[] arr){
        int i=0, j = 1;
        while(j <= arr.length -1){
            if(arr[j] != arr[i]){
                arr[++i] = arr[j];
            }
            j++;
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr, i + 1)));
        System.out.println(i+1 + " is the new length");

    }
}
