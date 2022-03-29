
public class DemoForloop1 {
	public static void main(String[] args) {
		int primecount=0;
		for(int i=10;i<=40;i++)
		{
			if(isPrime(i))
			{
				primecount++;
			
			}
			if (primecount==4) break;
		}
		
		
		System.out.println("Total no of prime number"+primecount);
	}
	public static boolean isPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0)
				return false;
		}
	
		return true;
	}
}
