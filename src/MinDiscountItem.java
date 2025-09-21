import java.util.*;

public class MinDiscountItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // number of items
        String[] names = new String[n];
        int[] discountValues = new int[n];

        // Step 1: Read input and calculate actual discount value
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");

            String itemName = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);

            int discountValue = (price * discountPercent) / 100; // actual discount

            names[i] = itemName;
            discountValues[i] = discountValue;
        }

        // Step 2: Find minimum discount value
        int minDiscount = discountValues[0];
        for (int i = 1; i < n; i++) {
            if (discountValues[i] < minDiscount) {
                minDiscount = discountValues[i];
            }
        }

        // Step 3: Print items with min discount value
        for (int i = 0; i < n; i++) {
            if (discountValues[i] == minDiscount) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
