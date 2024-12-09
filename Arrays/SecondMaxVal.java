public class SecondMaxVal {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        int max = arr[0];
        int secondMax = arr[0] - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else {
                if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println(secondMax);
    }
}
