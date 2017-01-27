package tp_tests;

import tp_class.Point;

public class TpJava13 {

	public static void main(String[] args) {
		Point p1 = new Point(10,15);
		Point p2 = new Point(5,6);
		System.out.println("Comparaison de deux points : ");
		p1.affiche();
		p2.affiche();
		System.out.println("egaux ? "+p1.equals(p2));
		
		System.out.println("Comparaison de deux points : ");
		p1 = new Point(24,32);
		p2 = new Point(24,32);
		p1.affiche();
		p2.affiche();
		System.out.println("egaux ? "+p1.equals(p2));
		

	}

}
