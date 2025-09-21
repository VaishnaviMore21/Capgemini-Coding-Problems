import java.util.*;

public class ArrayFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // Use LinkedHashMap to preserve insertion order
        LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();

        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.printf("%d occurs %d times\n", entry.getKey(), entry.getValue());
        }
    }
}
