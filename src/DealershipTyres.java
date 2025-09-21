import java.util.*;
public class DealershipTyres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of DealerShips");
int dealerships = sc.nextInt(); 
int[] results = new int[dealerships]; 
for(int i=0;i<dealerships;i++)
{
	int cars=sc.nextInt();
	int bikes=sc.nextInt();
	int totaltyres=(cars*4)+(bikes*2);
	 results[i] = (cars * 4) + (bikes * 2);
	
}   // print all outputs at once
for (int i = 0; i < dealerships; i++) {
    System.out.println(results[i]);
}

sc.close();
	}

}
