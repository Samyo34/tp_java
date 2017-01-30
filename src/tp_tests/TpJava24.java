package tp_tests;

import java.util.ArrayList;

import tp_class.Dessin;
import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Surfacable;

public class TpJava24 {

	public static void main(String[] args) {
		System.out.println("DISTANCE A L'ORIGINE : ");
//		Figure f1 = FigureUtil.getRandomFigure();
//		Figure f2 = FigureUtil.getRandomFigure();
		
//		System.out.println(f1 + " : "+f1.distanceOrigine());
//		System.out.println(f2 + " : "+f2.distanceOrigine());
		
		ArrayList<Figure> figs = (ArrayList<Figure>)FigureUtil.genere(10);
		for (Figure figure : figs) {
			System.out.println(figure + ","+figure.distanceOrigine());
		}
		
		System.out.println("TRIE : ");

		Dessin d = new Dessin();
		d.addAll(figs);
		
		figs = (ArrayList<Figure>)FigureUtil.trieProcheOrigin(d);
		for (Figure figure : figs) {
			System.out.println(figure+ ","+figure.distanceOrigine());
		}
		
		System.out.println("TRIE DOMINANT : ");
		ArrayList<Surfacable> figSur = (ArrayList<Surfacable>)FigureUtil.trieDominant(d);
		for (Surfacable surfacable : figSur) {
			System.out.println(surfacable);
		}
		

	}

}
