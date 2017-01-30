package tp_class;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
	
	private ArrayList<Figure> allFigs; 
	
	public Dessin()
	{
		allFigs = new ArrayList<Figure>();
	}
	
	public void add(Figure fig)
	{
		allFigs.add(fig);
	}
	
	public void addAll(Collection<Figure> figs)
	{
		allFigs =  new ArrayList<Figure>(figs);
	}
	
	public Collection<Figure> getFigures()
	{
		return this.allFigs;
	}

}
