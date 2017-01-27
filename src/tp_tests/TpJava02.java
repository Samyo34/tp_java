package tp_tests;

public class TpJava02 {

	public static void main(String[] args) {
		int varInt = 1234;
		float varFloat = varInt;
		
		System.out.println("val int : "+ varInt);
		System.out.println("val float : "+varFloat);
		
		varInt = 123456789;
		varFloat = varInt;
		
		System.out.println("******** autres valeurs ********");
		
		System.out.println("val int : "+ varInt);
		System.out.println("val float : "+varFloat);
		
		
		float x = 15;
		float z = 0;
		float y = -123;
		float a = x/z;
		float b = y/z;
		float c = a/b;
		
		System.out.println("x : "+x + " | "+ "y : "+y + " | "+"z : "+z + " | "+"x/z : "+a+ " | "+"y/z : "+ b + " | "+"a/b : "+c);
		

	}

}
