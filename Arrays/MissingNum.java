import java.util.Arrays;

public class MissingNum {

    public static int method1(int[] arr) {
        int n = arr.length + 1;
        int naturalSum = (n * (n + 1)) / 2;
        int elementSum = 0;
        for (int i = 0; i < arr.length; i++) {
            elementSum += arr[i];
        }
        int missingNum = naturalSum - elementSum;
        return missingNum;
    }

    public static int method2(int[] arr) {
        int missingNum = 0;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "==" + j);
            if (arr[i] == j) {
                j++;
                i = 0;
            }
        }

        return missingNum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 5};
        System.out.println(method2(arr));
    }
}
