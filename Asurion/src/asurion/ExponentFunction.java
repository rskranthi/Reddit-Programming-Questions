package asurion;

public class ExponentFunction {
	
	public static double findExponent(double x,int y)
	{
		if(y==0) return 1;
		if(y==1) return x;
		
		double v=findExponent(x,y/2);
		
		if(y%2==0) return v*v;
		else return x*v*v;
		
	}
	
	public static void main(String args[])
	{
		double x=2;
		int y=-5;
		if(y>0)
		System.out.println(findExponent(x, y));
		else
			System.out.println(1/findExponent(x, -y));
	}

}
