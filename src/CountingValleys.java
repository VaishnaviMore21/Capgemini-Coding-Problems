
class CountingValleys {

	 static int countingValleys(int steps, String path) {
	        int altitude = 0;
	        int valleys = 0;

	        for (int i = 0; i < steps; i++) {
	            char step = path.charAt(i);

	            if (step == 'U') {
	                altitude++;
	                if (altitude == 0) {
	                    valleys++; // exited a valley
	                }
	            } else {
	                altitude--;
	            }
	        }

	        return valleys;
	    }

	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        int steps = sc.nextInt();
	        String path = sc.next();
	        System.out.println(countingValleys(steps, path));
	        sc.close();
	    }
	
}
