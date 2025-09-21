
public class ConsecutiveCharReducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "aaabbcccddde";
	        String result = compressString(input);
	        System.out.println("Compressed string: " + result); 
	}
	static String compressString(String s)
	{
		if(s==null || s.isEmpty())return s;
		
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(s.charAt(i-1));
				sb.append(count);
				count=1;
			}
		}
		
		// Append last character and its count
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();
		
		
	}
	

}
