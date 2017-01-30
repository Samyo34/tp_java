package tp_tests;



import tp_class.Couleur;
import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Point;
import tp_class.Rectangle;
import tp_class.Rond;

public class TpJava23 {

	public static void main(String[] args) {
//		ArrayList<Figure> figs1 = (ArrayList<Figure>)FigureUtil.genere(5);
//		ArrayList<Figure> figs2 = (ArrayList<Figure>)FigureUtil.genere(5);
		
		Figure f1 = FigureUtil.getRandomFigure();
		Figure f2 = FigureUtil.getRandomFigure();
		
		System.out.println(f1 + "|" + f2 + " equals ? "+f1.equals(f2));
		
		Point p = FigureUtil.getRandomPoint();
		
		f1 = new Rond(p,10);
		f2 = new Rond(p,10);
		
		System.out.println(f1 + "|" + f2 + " equals ? "+f1.equals(f2));
		
		p = FigureUtil.getRandomPoint();
		
		
		f1 = new Rectangle(p, 10, 5,Couleur.bleu);
		f2 = new Rectangle(p, 10, 5,Couleur.bleu);
		
		System.out.println(f1 + "|" + f2 + " equals ? "+f1.equals(f2));
		
		

	}

}
