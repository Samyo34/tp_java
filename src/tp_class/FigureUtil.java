package tp_class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FigureUtil {
	
	public static Rond getRandomRond()
	{
		
		return new Rond(getRandomPoint(),getRandomNumber(),getRandomCouleur());
	}
	
	public static Rectangle getRandomRect()
	{
		return new Rectangle(getRandomPoint(),getRandomNumber(),getRandomNumber(),getRandomCouleur());
	}
	
	public static CarreHerit getRandomCarreHerit()
	{
		return new CarreHerit(getRandomPoint(),getRandomNumber(),getRandomCouleur());
	}
	
	public static Carre getRandomCarre()
	{
		return new Carre(getRandomPoint(),getRandomNumber());
	}
	
	public static Segment getRandomSegment()
	{
		return new Segment(getRandomPoint(),getRandomNumber(),getRandomBool(),getRandomCouleur());
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
	
	public static Collection<Point> getPointsByArray(Figure[] figs)
	{
		
		Collection<Point> pts = new ArrayList<Point>();
		for(int i = 0; i< figs.length;i++)
		{
			pts.addAll(new ArrayList<Point>(figs[i].getAllPoints()));
		}
		
		return pts;

	}
	
	public static Collection<Point> getPoints(Figure... figs)
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
	
	public static Collection<Figure> genere(int size)
	{
		Collection<Figure> figs = new ArrayList<Figure>();
		for(int i = 0; i< size;i++)
		{
			figs.add(getRandomFigure());
		}
		
		return figs;
	}
	
	public static Optional<Figure> getFigureEn(Point p, Dessin d)
	{
		
		return d.getFigures()
			.stream()
			.filter(f -> f.couvre(p))
			.findFirst();

		
//		Collection<Figure> figs = d.getFigures();
//		Iterator<Figure> it = figs.iterator();
//		while(it.hasNext() == true)
//		{
//			Figure f = it.next();
//			if(f.couvre(p))
//			{
//				return Optional.of(f);
//			}
//		}
//		
//		return Optional.empty();
	}
	
	public static Point getRandomPoint()
	{
		
		return new Point(getRandomNumber(),getRandomNumber());
	}

	public static ArrayList<Figure> trieProcheOrigin(Dessin d)
	{
		
		return (ArrayList<Figure>)d.getFigures()
				.stream()
				.sorted()
				.collect(Collectors.toList());
		
//		ArrayList<Figure> figs = (ArrayList<Figure>)d.getFigures();
//		Collections.sort(figs);
//		return figs;
	}

	public static ArrayList<Surfacable> trieDominant(Dessin d)
	{
		List<Surfacable> list = d.getFigures().stream()
		.filter(f -> f instanceof Surfacable)
		.map(f->(Surfacable)f)
		.sorted((f1,f2)->(int)(f1.surface()-f2.surface()))
		.collect(Collectors.toList());
		
		return (ArrayList<Surfacable>)list;
		
		
		
//		ArrayList<Figure> figs = (ArrayList<Figure>)d.getFigures();
//		ArrayList<Surfacable> res = new ArrayList<Surfacable>();
//		for (Figure figure : figs) {
//			if(figure instanceof Surfacable)
//			{
//				res.add((Surfacable)figure);
//			}
//		}
//		
//		Collections.sort(res, (f1,f2)->(int)(f1.surface()-f2.surface()));
//		return res;
	}
	
	private static int getRandomNumber()
	{
		return (int)(Math.random()*100);
	}
	
	private static int getRandomValue(int min, int max)
	{
		return (int)(Math.random()*(max - min));
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
	
	private static Couleur getRandomCouleur()
	{
		int max = Couleur.values().length;
		int index = getRandomValue(0,max-1);
		return Couleur.values()[index];
	}
}
