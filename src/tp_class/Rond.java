package tp_class;

import java.util.ArrayList;

public class Rond extends Figure implements Surfacable{
	
	//Point point = null;
	int ray = 0;
	
	public Rond(Point p, int ray){
		super(p);
		this.ray = ray;
	}

	public int getRay() {
		return ray;
	}

	public void setRay(int ray) {
		this.ray = ray;
	}
	
	@Override
	public String toString()
	{
		return "["+this.getType()+" "+this.getSource().toString()+","+this.surface()+"]";
	}
	
	public double surface()
	{
		return (double) (Math.PI * Math.pow(this.ray, 2));
	}

	@Override
	protected String getType() {
		return "ROND";
	}

	@Override
	protected ArrayList<Point> getPoints() {
		ArrayList<Point> pts = new ArrayList<Point>();
		pts.add(new Point(this.getSource()));
		return pts;
	}

	@Override
	protected Point[] getArrayPoints() {
		Point[] pts = new Point[1];
		pts[0] = new Point(this.getSource());
		return pts;
	}

	@Override
	protected boolean couvre(Point p) {
		return (Math.sqrt((Math.pow(p.getX() - this.getPoints().get(0).getX(),2))+
						Math.pow(p.getY() - this.getPoints().get(0).getY(), 2))<this.getRay());
	}
	
}
