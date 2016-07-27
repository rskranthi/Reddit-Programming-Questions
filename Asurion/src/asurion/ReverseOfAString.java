package asurion;

public class ReverseOfAString {

	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		System.out.println("Reversed String: "+stringReversal(str));
	}
	
	public static String stringReversal(String str)
	{
		char[] ch = str.toCharArray();
		
		char temp;int l=str.length();
		
		for(int i=0;i<l/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[l-1-i];
			ch[l-1-i]=temp;
		}
		
		return String.valueOf(ch);
	}
}
