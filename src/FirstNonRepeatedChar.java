import java.util.HashMap;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (countMap.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}

//public class FirstNonRepeatedCharArray {
//    public static void main(String[] args) {
//        String str = "swiss";
//        int[] freq = new int[26]; // assuming only lowercase letters
//
//        for (char ch : str.toCharArray()) {
//            freq[ch - 'a']++;
//        }
//
//        for (char ch : str.toCharArray()) {
//            if (freq[ch - 'a'] == 1) {
//                System.out.println("First non-repeated character: " + ch);
//                break;
//            }
//        }
//    }
//}
