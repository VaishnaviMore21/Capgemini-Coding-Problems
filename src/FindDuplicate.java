import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 5};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate found: " + num);
            } else {
                set.add(num);
            }
        }
    }
}
