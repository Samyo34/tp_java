package tp_class;

public class Carre {
	
	private Point pointHautGauche;
	private Point pointHautDroit;
	private Point pointBasGauche;
	private Point pointBasDroit;
	
	private int range = 0;
	
	private String type = "CARRE ";
	
	public Carre(Point p, int range)
	{
		pointHautGauche = new Point(p.getX(),p.getY());
		pointHautDroit = new Point(p.getX()+range,p.getY());
		pointBasGauche = new Point(p.getX(),p.getY()+range);
		pointBasDroit = new Point(p.getX()+range,p.getY()+range);
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointHautGauche() {
		return pointHautGauche;
	}

	public void setPointHautGauche(Point pointHautGauche) {
		this.pointHautGauche = pointHautGauche;
	}

	public Point getPointHautDroit() {
		return pointHautDroit;
	}

	public void setPointHautDroit(Point pointHautDroit) {
		this.pointHautDroit = pointHautDroit;
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
	
	public String toString()
	{
		return "["+this.getType()+ " "+this.pointHautGauche.toString()+this.pointHautDroit.toString()+this.pointBasDroit.toString()+this.pointBasGauche.toString()+","+this.getRange()+"]";
	}
	
	public void affiche()
	{
		System.out.println(this.toString());
	}
}
