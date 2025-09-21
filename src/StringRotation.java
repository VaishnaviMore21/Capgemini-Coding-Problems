
public class StringRotation {
	 public static boolean isRotation(String s1, String s2) {
	        // Check if lengths are same
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Concatenate s1 with itself
	        String combined = s1 + s1;

	        // Check if s2 is a substring of combined
	        return combined.contains(s2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s1 = "ABCD";
	        String s2 = "CDAB";

	        if (isRotation(s1, s2)) {
	            System.out.println(s2 + " is a rotation of " + s1);
	        } else {
	            System.out.println(s2 + " is NOT a rotation of " + s1);
	        }
	}

}
