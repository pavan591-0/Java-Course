package problemSolving;

public class MoveZeros {
    public static void main(String[] args){

        int[] arr1 = {0,1,0,3,12};
        int[] arr2 = {0,0,0,1,2,3};
        int[] arr3 = {1,2,0,3,0,4};

        moveZerosToEnd(arr1);
        moveZerosToEnd(arr2);
        moveZerosToEnd(arr3);

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
    }

    private static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i);
        }
        System.out.println();
    }

    private static void moveZerosToEnd(int[] arr) {

        int j = 0;
        for(int i : arr) {
            if (i != 0) {
                arr[j++] = i;
            }
        }

        int len = arr.length;

        for(; j<len; j++){
            arr[j] = 0;
        }

    }
}
