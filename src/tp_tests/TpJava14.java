package tp_tests;

import tp_class.Figure;
import tp_class.FigureUtil;

/**
 * 
 * @author formation5
 * test TP 14 et TP 15
 */
public class TpJava14 {

	public static void main(String[] args) {
		
		System.out.println("Création d'une figure random : ");
		Figure f = FigureUtil.getRandomFigure();
		f.affiche();
	}
}
