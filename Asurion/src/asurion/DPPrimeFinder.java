package asurion;

public class DPPrimeFinder {

	int[] primes;
	public static void main(String args[])
	{
		int n=200;
		DPPrimeFinder primeFinder = new DPPrimeFinder(n);
	}
	
	public DPPrimeFinder(int n)
	{
		primes = new int[n];
		primes[0]=2;primes[1]=3;
		
		for(int k=2,i=5;k<n;i++)
		{
			if(isPrime(i))primes[k++]=i;
		}
		
		for(int k=0;k<n;k++)
		System.out.print(primes[k]);
	}
	
		
	public boolean isPrime(int x)
	{
		if(x<2) return false;
		
		for(int k=0;k<primes.length&& primes[k]*primes[k]<=x;k++)
		{
			if(x%primes[k]==0)return false;
		}
		
		return true;
	}
}
