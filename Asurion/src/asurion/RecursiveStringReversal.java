package asurion;

public class RecursiveStringReversal {
	
	public static void main(String args[])
	{
		String str="geeksforgeeks";
		System.out.println("Reversed String after Recursion: "+getRecursiveReversedString(str));
	}

	public static String getRecursiveReversedString(String str)
	{
		if(str.length()==0) return str;
		
		
		else return getRecursiveReversedString(str.substring(1, str.length()))+str.charAt(0);
	}
}
