package tp_class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Dessin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -770704200338356531L;
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
