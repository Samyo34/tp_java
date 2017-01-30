package tp_class;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends Figure implements Surfacable{
	
	private Point pointHautDroite = null;
	private Point pointBasGauche = null;
	private Point pointBasDroit = null;
	
	
	int longueur = 0;
	int largeur = 0;
	
	/**
	 * Constructor
	 * @param p : point haut gauche
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(Point p, int longueur, int largeur)
	{
		super(p);
		this.pointHautDroite = new Point(p.getX()+longueur,p.getY());
		this.addPoint(this.pointHautDroite);
		this.pointBasGauche = new Point(p.getX(),p.getY()+largeur);
		this.addPoint(this.pointBasGauche);
		this.pointBasDroit = new Point(p.getX()+longueur,p.getY()+largeur);
		this.addPoint(this.pointBasDroit);
		this.longueur = longueur;
		this.largeur = largeur;
		
	}


	public Point getPointHautDroite() {
		return pointHautDroite;
	}

	public void setPointHautDroite(Point pointHautDroite) {
		this.pointHautDroite = pointHautDroite;
	}

	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public void setPointBasGauche(Point pointBasGauche) {
		this.pointBasGauche = pointBasGauche;
	}

	public Point getPointBasDroit() {
		return pointBasDroit;
	}

	public void setPointBasDroit(Point pointBasDroit) {
		this.pointBasDroit = pointBasDroit;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public String toString()
	{
		return "["+this.getType()+" "+this.getSource().toString()+this.pointHautDroite.toString()+this.pointBasDroit.toString()+this.pointBasGauche.toString()+","+this.getLargeur()+","+this.getLongueur()+","+this.surface()+"]";
	}
	
	public double surface()
	{
		return (double) (this.largeur * this.longueur);
	}


	@Override
	protected String getType() {
		return "RECT";
	}


	@Override
	protected Collection<Point> getPoints() {
		Collection<Point> points = new ArrayList<Point>();
		points.add(new Point(this.getSource()));
		points.add(new Point(this.pointHautDroite));
		points.add(new Point(this.pointBasDroit));
		points.add(new Point(this.pointBasGauche));
//		points[0] = new Point(this.getSource());
//		points[1] = new Point(this.pointHautDroite);
//		points[2] = new Point(this.pointBasDroit);
//		points[3] = new Point(this.pointBasGauche);
		return points;
	}


	@Override
	protected Point[] getArrayPoints() {
		Point[] points = new Point[4];
		points[0] = new Point(this.getSource());
		points[1] = new Point(this.pointHautDroite);
		points[2] = new Point(this.pointBasDroit);
		points[3] = new Point(this.pointBasGauche);
		return points;
	}

	/*
	 * (non-Javadoc)
	 * @see tp_class.Figure#couvre(tp_class.Point)
	 * 0 - - 1
	 * |     |
	 * 3 - - 2
	 */
	@Override
	public boolean couvre(Point p) {
		ArrayList<Point> pts = this.getAllPoints();
		if((p.getX() > pts.get(0).getX() && p.getX() < pts.get(1).getX()) &&
			 (p.getY() > pts.get(0).getY() && p.getY() < pts.get(3).getY())	)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
