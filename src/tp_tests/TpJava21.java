package tp_tests;

import java.util.ArrayList;

import tp_class.Dessin;
import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Point;

public class TpJava21 {

	public static void main(String[] args) {
		
		ArrayList<Figure> figs = new ArrayList<Figure>();
		figs = FigureUtil.genere(10);
		Dessin d = new Dessin();
		
		for (Figure figure : figs) {
			d.add(figure);
			figure.affiche();
		}
		
		System.out.println("LISTE DES POINTS : ");
		for (Figure figure : d.getFigures()) {
			for(Point p : figure.getAllPoints())
			{
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
