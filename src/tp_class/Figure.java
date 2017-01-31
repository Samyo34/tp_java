package tp_class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Figure implements Comparable<Figure>, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4312119445289262446L;
	private Point source;
	private ArrayList<Point> points; // pour le tp 21
//	private String type = "FIG";
	
	private Couleur couleur;
	
	public Couleur getCouleur()
	{
		return this.couleur;
	}
	
	public Figure()
	{
		this.couleur = Couleur.getCouleurDefaut();
	}
	
	public Figure(Couleur c)
	{
		this.couleur = c;
	}
	
	
	public Figure(Point p)
	{
		points = new ArrayList<Point>();
		this.source = new Point(p.getX(),p.getY());
		points.add(new Point(p));
	}
	
	public Figure(Point p, Couleur c)
	{
		points = new ArrayList<Point>();
		this.source = new Point(p.getX(),p.getY());
		points.add(new Point(p));
		this.couleur = c;
	}

	protected Point getSource() {
		return source;
	}

	protected void setSource(Point p) {
		this.source = p;
	}
	
	public Collection<Point> getAllPoints()
	{
		return new ArrayList<Point>(this.points);
	}

	protected abstract String getType();

	protected abstract Collection<Point> getPoints();
	
	protected abstract Point[] getArrayPoints();
		
	public abstract String toString();
	
	public abstract boolean couvre(Point p);
	
	public double distanceOrigine()
	{
		Point p = new Point(); // init à INIT_X INIT_Y
		double minDist = p.dist(this.points.get(0));
		for (Point point : points) {
			if(p.dist(point) < minDist)
			{
				minDist = p.dist(point);
			}
		}
		return minDist;
	}
	
	@Override
	public int compareTo(Figure o) {
		if(this.distanceOrigine() > o.distanceOrigine())
		{
			return 1;
		}
		else if(this.distanceOrigine() == o.distanceOrigine())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

	
	public void affiche()
	{
		System.out.println(this.toString());
	}
	
	protected void addPoint(Point p)
	{
		this.points.add(new Point(p));
	}
	
}
