public class minVal {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 75, 34, 899, 2, 55, 1 };
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i);
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
}
