package tp_tests;

import java.util.ArrayList;
import tp_class.Dessin;
import tp_class.Figure;
import tp_class.FigureUtil;

public class TpJava25 {

	public static void main(String[] args) {
		ArrayList<Figure> list = (ArrayList<Figure>) FigureUtil.genere(7);
		for (Figure fig : list) {
			fig.affiche();
		}
		System.out.println("TRI DOMINANT : ");
		Dessin d = new Dessin();
		d.addAll(list);
		System.out.println(FigureUtil.trieDominant(d));

	}

}
