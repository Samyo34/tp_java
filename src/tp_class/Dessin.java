package tp_class;

import java.util.ArrayList;

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
	
	public void addAll(ArrayList<Figure> figs)
	{
		allFigs = figs;
	}
	
	public ArrayList<Figure> getFigures()
	{
		return new ArrayList<Figure>(this.allFigs);
	}

}
