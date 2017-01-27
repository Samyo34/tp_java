package tp_tests;

import tp_class.Carre;
import tp_class.CarreHerit;
import tp_class.FigureUtil;
import tp_class.Rectangle;

public class TpJava12 {
	
	public static void main(String[] args) {
		System.out.println("carr� normal (sans heritage)");
		Carre c = FigureUtil.getRandomCarre();
		c.affiche();
		
		System.out.println("carr� herit� de Rectangle");
		CarreHerit ch = FigureUtil.getRandomCarreHerit();
		ch.affiche();
		
		System.out.println("Rectangle");
		Rectangle rec = FigureUtil.getRandomRect();
		rec.affiche();
	}
}
