package tp_tests;

import tp_class.Figure;
import tp_class.FigureUtil;
import tp_class.Point;

public class TpJava20 {

	public static void main(String[] args) {
		Figure[] figs = new Figure[4];
		figs[0] = FigureUtil.getRandomFigure();
		figs[1] = FigureUtil.getRandomFigure();
		figs[2] = FigureUtil.getRandomFigure();
		figs[3] = FigureUtil.getRandomFigure();
		
		System.out.println("Récupération des points de figures");
		Point[] pts = FigureUtil.getArrayPointsByArray(figs);
		for(int i = 0; i<pts.length;i++)
		{
			System.out.println(pts[i]);
		}
		
		System.out.println("Récupération des points de figures v2");
		pts = FigureUtil.getArrayPoints(figs[0],figs[1],figs[2],figs[3]);
		for(int i = 0; i<pts.length;i++)
		{
			System.out.println(pts[i]);
		}
			
		

	}

}
