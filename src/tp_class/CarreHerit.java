package tp_class;

public class CarreHerit extends Rectangle{
	
	public CarreHerit(Point p, int range,Couleur r)
	{
		super(p,range,range,r);
	}
	
	@Override
	public String getType()
	{
		return "CARRE";
	}

}
