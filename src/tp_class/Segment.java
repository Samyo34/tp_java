package tp_class;

import java.util.ArrayList;
import java.util.Collection;

public class Segment extends Figure{
	
	private Point fin;
	private int longueur;
	private boolean horiztontal;
	
	public Segment(Point debut, int longueur, boolean horizontal, Couleur c)
	{
		super(debut,c);
		this.horiztontal = horizontal;
		this.longueur = longueur;
		if(horizontal)
		{
			fin = new Point(debut.getX()+longueur,debut.getY());
		}
		else
		{
			fin = new Point(debut.getX(),debut.getY()+longueur);
		}
		this.addPoint(fin);
		
		
	}

	public Point getFin() {
		return fin;
	}

	public void setFin(Point fin) {
		this.fin = fin;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public boolean isHoriztontal() {
		return horiztontal;
	}

	public void setHoriztontal(boolean horiztontal) {
		this.horiztontal = horiztontal;
	}
	
	public String toString()
	{
		return "["+this.getType()+" "+this.getCouleur()+ " "+this.getSource().toString()+"=>"+this.fin.toString()+"]";
	}

	@Override
	protected String getType() {
		return "SEG";
	}

	@Override
	protected Collection<Point> getPoints() {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(this.getSource()));
		points.add(new Point(this.fin));
//		Point[] points = new Point[2];
//		points[0] = new Point(this.getSource());
//		points[1] = new Point(this.fin);
		return points;
	}

	@Override
	protected Point[] getArrayPoints() {
		Point[] points = new Point[2];
		points[0] = new Point(this.getSource());
		points[1] = new Point(this.fin);
		return points;
	}

	@Override
	public boolean couvre(Point p) {
		ArrayList<Point> pts = (ArrayList<Point>) this.getAllPoints();
		int val = 1;
		if(pts.get(1).getY()-pts.get(0).getY() > 0)
		{
			val = (pts.get(1).getY()-pts.get(0).getY());
		}
		return (((pts.get(1).getX()-pts.get(0).getX())/
				(val))==
				((p.getX()-pts.get(0).getX())/
				(p.getY()-pts.get(0).getY())) &&
				(p.getX()<=pts.get(1).getX() && p.getX()<=pts.get(0).getX()));
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Figure)
		{
			if(o instanceof Segment)
			{
				return ((((Segment)o).getSource().equals(this.getSource()) && ((Segment)o).getFin().equals(this.getFin())) && ((Figure)o).getCouleur() == this.getCouleur());
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
