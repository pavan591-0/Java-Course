package problemSolving;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args){

        findMissingNumber(new int[]{1,2,3,4}, 5);
        findMissingNumber(new int[]{2,3,4,5}, 5);
        findMissingNumber(new int[]{1}, 2);
        findMissingNumber(new int[]{1,2,3}, 4);
        findMissingNumber(new int[]{}, 1);

        findMissingXor(new int[]{1,2,3,4}, 5);

    }

    private static void findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n+1) ) / 2;
        int missingValue = expectedSum - Arrays.stream(arr).sum();
        System.out.println("For "+Arrays.toString(arr)+" and length: "+n+", the missing value is: "+ missingValue);
    }

    private static void findMissingXor(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR all numbers in array
        for (int num : arr) {
            xor2 ^= num;
        }

        System.out.println("For "+Arrays.toString(arr)+" and length: "+n+", the missing value is: "+ (xor1 ^ xor2));

    }
}
