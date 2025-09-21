import java.util.Arrays;

public class RotateArrayInPlace {

    // Function to rotate the array by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        System.out.println("Original array: " + Arrays.toString(arr));

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        System.out.println("After reversing whole array: " + Arrays.toString(arr));

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        System.out.println("After reversing first " + k + " elements: " + Arrays.toString(arr));

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);
        System.out.println("After reversing remaining elements: " + Arrays.toString(arr));
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);

        System.out.println("Final rotated array: " + Arrays.toString(arr));
    }
}
