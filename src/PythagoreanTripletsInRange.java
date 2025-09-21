public class PythagoreanTripletsInRange {
    public static void main(String[] args) {
        int N = 20; // Upper limit

        System.out.println("Pythagorean triplets from 1 to " + N + ":");
        for (int a = 1; a <= N; a++) {
            for (int b = a; b <= N; b++) { // start from a to avoid duplicates
                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);
                if (c <= N && c * c == cSquare) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}
