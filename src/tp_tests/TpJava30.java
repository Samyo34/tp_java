package tp_tests;

import tp_class.Couleur;
import tp_class.FigureUtil;
import tp_class.Rond;

public class TpJava30 {

	public static void main(String[] args) {
		System.out.println(Couleur.getCouleurDefaut());
		
		Rond r = FigureUtil.getRandomRond();
		System.out.println(r);

	}

}
