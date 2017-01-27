package tp_class;

public class CarreHerit extends Rectangle{
	
	public CarreHerit(Point p, int range)
	{
		super(p,range,range);
	}
	
	@Override
	public String getType()
	{
		return "CARRE";
	}

}
