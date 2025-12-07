package problemSolving.basic;

public class SwapArray {

    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2};
        int[] arr3 = {1,2,3,4,5,6};

        swapArray(arr1);
        swapArray(arr2);
        swapArray(arr3);

    }

    private static void swapArray(int[] arr) {
        int i=0;
        int j=arr.length - 1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele: arr){
            System.out.print(ele);
        }
        System.out.println();
    }

}
