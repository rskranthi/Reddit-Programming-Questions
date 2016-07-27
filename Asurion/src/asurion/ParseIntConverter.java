package asurion;


public class ParseIntConverter {
	
	public static long findParseInt(String n)
	{
		long sum=0;
		
		char[] ch = n.toCharArray();
		int zeroAscii = (int) '0';
		for(char c:ch)
		{
			int tmpAscii = (int)c;
			sum = sum * 10 + (tmpAscii-zeroAscii);
		}
		
		
		
		return sum;
	}
	
	public static void main(String args[])
	{
		String n= "50000000000000000000000";
		System.out.println(findParseInt(n));
		
	}

}
