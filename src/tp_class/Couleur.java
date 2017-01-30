package tp_class;

public enum Couleur {
	rouge('R'), vert('V'), jaune('J'), bleu('B'), noir('N');
	
	private char code;
	
	public static Couleur getCouleurDefaut()
	{
		return Couleur.noir;
	}
	
	private Couleur(char c)
	{
		this.code = c;
	}
	
	public char getCode()
	{
		return this.code;
	}
}
