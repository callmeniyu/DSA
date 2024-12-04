import java.util.Arrays;

public class RemoveEvenInt {
    public static void main(String[] args) {
        System.out.println("\n");
        int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
        int[] k = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                k[j] = arr[i];
                j++;
            }
        };
        int[] result = Arrays.copyOf(k, j);
        System.out.println(Arrays.toString(result));
    }
}
