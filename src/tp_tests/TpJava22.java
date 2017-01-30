package tp_tests;

import java.util.ArrayList;
import java.util.Collection;

import tp_class.Dessin;
import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Point;

public class TpJava22 {

	public static void main(String[] args) {
		Collection<Figure> figs = new ArrayList<Figure>();
		figs = FigureUtil.genere(10);
		Dessin d = new Dessin();
		
		for (Figure figure : figs) {
			d.add(figure);
			figure.affiche();
		}
		
		Point p = FigureUtil.getRandomPoint();
		d.addAll(figs);
		
		System.out.println("COUVRE : "+p);
		
		for (Figure figure : figs) {
			if(figure.couvre(p))
			{
				figure.affiche();
			}
		}
		
		System.out.println("Figure en : " + p);
		FigureUtil.getFigureEn(p, d).affiche();

	}

}
