package tp_tests;

public class TpJava04 {

	public static void main(String[] args) {
		
		float value = 5000;
		
		if(value < 1000)
		{
			System.out.println("remise de 0% ! " + value);
		}
		else if(value < 2000)
		{
			System.out.println("remise de 1% ! " + value+"=>"+(value - value*0.01));
		}
		else if (value < 5000)
		{
			System.out.println("remise de 3% ! "+ value+"=>"+(value - value*0.03));
		}
		else
		{
			System.out.println("remise de 5% ! "+ value+"=>"+(value - value*0.05));
		}
		
		System.out.println("**** Poids ****");
		System.out.println(computeSize(5));
		
	}
	
	public static String computeSize(int poid)
	{
		String res = "";
		switch(poid)
		{
			case 1 : 
				res = "petit";
				break;
			
			case 2 : 
				res = "moyen";
				break;
			
			default : 
				res = "grand";
				break;
		}
		
		return res;
	}
	
}
