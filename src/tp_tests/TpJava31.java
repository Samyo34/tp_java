package tp_tests;

import java.io.IOException;

import tp_class.Dessin;
import tp_class.FigureUtil;
import tp_class.ImpressionHorsLimiteException;

public class TpJava31 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, ImpressionHorsLimiteException {
		Dessin d = new Dessin();
		//d.add(FigureUtil.getRandomRond());
		d.addAll(FigureUtil.genere(5));
		
		FigureUtil.imprime(d);
		
		FigureUtil.save(d);
		
		Dessin des = FigureUtil.load("save.bin");
		des.getFigures().stream()
		.forEach(f -> f.affiche());

	}

}
