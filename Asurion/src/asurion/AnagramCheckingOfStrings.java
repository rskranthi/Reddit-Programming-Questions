package asurion;

import java.util.Arrays;

public class AnagramCheckingOfStrings {
	
	public static void main(String args[])
	{
		String str1 = "abcd";
		String str2 = "dbca";
		
		System.out.println(anagramChecker(str1,str2));
	}
	
	public static boolean anagramChecker(String str1,String str2)
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(String.valueOf(ch1).equals(String.valueOf(ch2)))return true;
		else return false;
		
	}

}
