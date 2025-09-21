/*import java.util.Scanner;

public class MaxMarksSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int semesters = sc.nextInt();

        // Loop through each semester
        for (int i = 1; i <= semesters; i++) {
            System.out.print("Enter no of subjects in " + i + " semester: ");
            int subjects = sc.nextInt();

            int maxMark = -1; // to store maximum mark in semester
            boolean invalid = false;

            System.out.print("Marks obtained in semester " + i + ": ");
            for (int j = 0; j < subjects; j++) {
                int mark = sc.nextInt();

                // validate mark range
                if (mark < 0 || mark > 100) {
                    invalid = true;
                }

                if (mark > maxMark) {
                    maxMark = mark;
                }
            }

            // Print result
            if (invalid) {
                System.out.println("You have entered invalid mark.");
            } else {
                System.out.println("Maximum mark in " + i + " semester: " + maxMark);
            }
        }

        sc.close();
    }
}
*/
import java.util.Scanner;

public class MaxMarksSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int semesters = sc.nextInt();

        int[][] marks = new int[semesters][];   // jagged array to hold marks
        boolean[] invalid = new boolean[semesters]; // track invalid entries

        // Step 1: Take all input
        for (int i = 0; i < semesters; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    invalid[i] = true;
                }
            }
        }

        // Step 2: Process and display output
        for (int i = 0; i < semesters; i++) {
            if (invalid[i]) {
                System.out.println("You have entered invalid mark.");
            } else {
                int maxMark = -1;
                for (int mark : marks[i]) {
                    if (mark > maxMark) {
                        maxMark = mark;
                    }
                }
                System.out.println("Maximum mark in " + (i + 1) + " semester: " + maxMark);
            }
        }

        sc.close();
    }
}
