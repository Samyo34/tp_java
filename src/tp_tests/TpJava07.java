package tp_tests;

public class TpJava07 {

	public static void main(String[] args) {
		int n = 20;
		int nbFound = 0;
		int nbPremier =0;
		while(nbFound < n)
		{
			nbPremier++;
			if(isPrime(nbPremier))
			{
				System.out.println("found " + nbPremier);
				nbFound++;
			}
		}

	}
	
	public static boolean isPrime(int value)
	{
		for(int i = 2;i<value-1;i++)
		{
			if( (value%i) == 0)
			{
				// divisible
				return false;
			}
		}
		
		return true;
	}
}
