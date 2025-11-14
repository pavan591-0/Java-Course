package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {6,7, 2, 3, 4};
        int[] arr3 = {0};
        int[] result = new int[2];

        int target = 9;
        twoSum(arr1, result, target);
        printArr(result);

        target = 10;
        twoSum(arr2, result, target);
        printArr(result);

        target = 21;
        twoSum(arr3, result, target);
        printArr(result);

    }

    private static void printArr(int[] result) {
        if(result[0] == Integer.MIN_VALUE){
            System.out.println("No such elements found.");
            return;
        }
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    private static void twoSum(int[] arr, int[] result, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            int diff = target - arr[i];
            if(values.containsKey(diff)){
                result[0] = values.get(diff);
                result[1] = i;
                return;
            }
            values.put(arr[i], i);
        }

        result[0] = Integer.MIN_VALUE;
    }


}
