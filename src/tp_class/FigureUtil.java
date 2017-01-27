package tp_class;

import java.util.ArrayList;

public class FigureUtil {
	
	
	public static Rond getRandomRond()
	{
		
		return new Rond(getRandomPoint(),getRandomNumber());
	}
	
	public static Rectangle getRandomRect()
	{
		return new Rectangle(getRandomPoint(),getRandomNumber(),getRandomNumber());
	}
	
	public static CarreHerit getRandomCarreHerit()
	{
		return new CarreHerit(getRandomPoint(),getRandomNumber());
	}
	
	public static Carre getRandomCarre()
	{
		return new Carre(getRandomPoint(),getRandomNumber());
	}
	
	public static Segment getRandomSegment()
	{
		return new Segment(getRandomPoint(),getRandomNumber(),getRandomBool());
	}
	
	public static Surfacable getRandomSurfacable()
	{
		int rdValue = (int)( Math.random() *100);
		if(rdValue < 33)
		{
			return getRandomRond();
		}
		else if(rdValue < 66)
		{
			return getRandomRect();
		}
		else
		{
			return getRandomCarreHerit();
		}
	}
	
	public static Figure getRandomFigure()
	{
		int rdValue = (int)( Math.random() *100);
		if(rdValue < 75)
		{
			return (Figure)getRandomSurfacable();
		}
		else
		{
			return getRandomSegment();
		}
	}
	
	public static ArrayList<Point> getPointsByArray(Figure[] figs)
	{
		
		ArrayList<Point> pts = new ArrayList<Point>();
		for(int i = 0; i< figs.length;i++)
		{
			pts.addAll(new ArrayList<Point>(figs[i].getAllPoints()));
		}
		
		return pts;

	}
	
	public static ArrayList<Point> getPoints(Figure... figs)
	{
		return getPointsByArray(figs);		
	}
	
	public static Point[] getArrayPoints(Figure... figs)
	{
		return getArrayPointsByArray(figs);
	}
	
	public static Point[] getArrayPointsByArray(Figure[] figs)
	{
		int size = 0;
		for(int i = 0; i<figs.length;i++)
		{
			size += figs[i].getArrayPoints().length;
		}
		Point[] pts = new Point[size];
		int cpt =0;
		for(int i = 0; i<figs.length;i++)
		{
			for(int j = 0; j<figs[i].getArrayPoints().length;j++)
			{
				pts[cpt] = new Point(figs[i].getArrayPoints()[j]);
				cpt++;
			}
			
		}
		
		return pts;
	}
	

	public static ArrayList<Figure> genere(int size)
	{
		ArrayList<Figure> figs = new ArrayList<Figure>();
		for(int i = 0; i< size;i++)
		{
			figs.add(getRandomFigure());
		}
		
		return figs;
	}
	
	private static Point getRandomPoint()
	{
		
		return new Point(getRandomNumber(),getRandomNumber());
	}


	private static int getRandomNumber()
	{
		return (int)(Math.random()*100);
	}
	
	private static boolean getRandomBool()
	{
		int value = (int)(Math.random()*100);
		if(value > 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
