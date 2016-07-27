package asurion;

public class BinaryFormat {
	
	
	
	public static String findBinaryFormat(int n)
	{
		StringBuilder sb = new StringBuilder("");
		int d;
		
		while(n>0)
		{
			d=n%2;
			n=n/2;
			sb.append(d);
		}
		
		return new String(sb.reverse());
	}
	
	public static void main(String args[])
	{
		int n = 8;
		System.out.println(findBinaryFormat(n));
	}

}
