import java.util.Scanner;
public class FindFactor {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	        
	int num = sc.nextInt();
	        
	        // If input is negative, take absolute value
	 num = Math.abs(num);
	 if(num==0)
	 {
		 System.out.println("No factors");
	 }
	 else
	 {
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
			 {
				 if(i==num)
				 {
					 System.out.print(i);   
				 }
				 else
				 {
					 System.out.print(i + ", "); 
				 }
			 }
		 }
	 }
	        
		// TODO Auto-generated method stub

	}

}
