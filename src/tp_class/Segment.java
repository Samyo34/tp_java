package tp_class;

import java.util.ArrayList;

public class Segment extends Figure{
	
	private Point fin;
	private int longueur;
	private boolean horiztontal;
	
	public Segment(Point debut, int longueur, boolean horizontal)
	{
		super(debut);
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
		return "["+this.getType()+" "+this.getSource().toString()+"=>"+this.fin.toString()+"]";
	}

	@Override
	protected String getType() {
		return "SEG";
	}

	@Override
	protected ArrayList<Point> getPoints() {
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
		int val = 1;
		if((this.getPoints().get(1).getY()-this.getPoints().get(0).getY()) > 0)
		{
			val = (this.getPoints().get(1).getY()-this.getPoints().get(0).getY());
		}
		return (((this.getPoints().get(1).getX()-this.getPoints().get(0).getX())/
				(val))==
				((p.getX()-this.getPoints().get(0).getX())/
				(p.getY()-this.getPoints().get(0).getY())) &&
				(p.getX()<=this.getPoints().get(1).getX() && p.getX()<=this.getPoints().get(0).getX()));
	}

}
