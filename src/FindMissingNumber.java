import java.util.*;

public class FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // sum of 1..n
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum; // missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int missing = findMissing(arr, n);
        System.out.println("Missing number is: " + missing);
    }
}
