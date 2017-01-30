package tp_class;

public class Point {
	
	private final int INIT_X = 25;
	private final int INIT_Y = 25;
	
	private int x = 0;
	private int y = 0;
	
	public Point()
	{
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p)
	{
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "["+this.getX()+":"+this.getY()+"]";
	}
	
	public void affiche()
	{
		System.out.println(this.toString());
	}
	
	public double dist(Point p)
	{
		double xAB =  this.getX() - p.getX();
		double xAB2 = xAB * xAB;
		double yAB = this.getY() - p.getY();
		double yAB2 = yAB * yAB;
		double dist = Math.sqrt(xAB2 + yAB2); 
		return dist;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Point)
		{
			Point p = (Point) o;
			return ( (this.getX() == p.getX()) && (this.getY() == p.getY()) );
		}
		else
		{
			return false;
		}
		
	}



}
