package tp_class;

import java.util.ArrayList;

public abstract class Figure {
	
	private Point source;
	private ArrayList<Point> points; // pour le tp 21
//	private String type = "FIG";
	
	public Figure(Point p)
	{
		points = new ArrayList<Point>();
		this.source = new Point(p.getX(),p.getY());
		points.add(new Point(p));
	}

	protected Point getSource() {
		return source;
	}

	protected void setSource(Point p) {
		this.source = p;
	}
	
	public ArrayList<Point> getAllPoints()
	{
		return new ArrayList<Point>(this.points);
	}

	protected abstract String getType();

	protected abstract ArrayList<Point> getPoints();
	
	protected abstract Point[] getArrayPoints();
		
	public abstract String toString();
	
	public void affiche()
	{
		System.out.println(this.toString());
	}
	
	protected void addPoint(Point p)
	{
		this.points.add(new Point(p));
	}
	
}
