public class AscOrDec {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Ascending order
        int[] arr2 = {5, 4, 3, 2, 1}; // Descending order
        int[] arr3 = {3, 1, 4, 2, 5}; // Random order

        System.out.println("arr1 is sorted: " + isSorted(arr1));
        System.out.println("arr2 is sorted: " + isSorted(arr2));
        System.out.println("arr3 is sorted: " + isSorted(arr3));
    }

    public static boolean isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        // Check if array is in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        // Check if array is in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
                break;
            }
        }

        // If either ascending or descending is true, array is sorted
        return ascending || descending;
    }
}

