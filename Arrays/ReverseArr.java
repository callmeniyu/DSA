import java.util.Arrays;

public class ReverseArr {

    public static int[] method1(int[] arr) {
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[arr.length - (i + 1)];
        }
        return tempArr;
    }
    public static int[] method2(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 11, 3, 13, 7, 8,66 };
        
        System.out.println(Arrays.toString(method2(arr, 0 , arr.length-1)));
    }
}
