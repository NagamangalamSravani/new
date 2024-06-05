import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, -3, 2, -1, 5, -7};

        // Sort the array with negative values at the end
        Arrays.sort(arr);

        // Rearrange the array so that negative values are at the end
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
