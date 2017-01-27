package tp_tests;

import tp_class.FigureUtil;
import tp_class.Rectangle;
import tp_class.Rond;

public class TpJava11 {

	public static void main(String[] args) {
		System.out.println("Random rond");
		Rond r = FigureUtil.getRandomRond();
		r.affiche();
		
		System.out.println("Random Rectangle");
		Rectangle rec = FigureUtil.getRandomRect();
		rec.affiche();
		

	}

}
