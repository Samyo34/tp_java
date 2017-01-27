package tp_tests;

import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Surfacable;

public class TpJava15 {

	public static void main(String[] args) {
		System.out.println("Création d'une figure surfacable random");
		Surfacable f = FigureUtil.getRandomSurfacable();
		((Figure)f).affiche();
	}

}
