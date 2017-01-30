package tp_tests;

import tp_class.Couleur;
import tp_class.Point;
import tp_class.Rectangle;
import tp_class.Rond;

/**
 * 
 * @author formation5
 * class de test exo 10
 */
public class TpJava10 {
	
	public static void main(String[] args) {
		System.out.println("Cr�ation d'un point p en 10:10 ");
		Point p = new Point(10,10);
		
		System.out.println("Cr�ation d'un Rond r centr� en p avec un rayon de 5");
		Rond r = new Rond(p,5);
		r.affiche();
		
		System.out.println("Cr�ation d'un rectangle rec ayant p comme point sup�rieur gauche et de longueur 10 et largeur 8");
		Rectangle rec = new Rectangle(p,10,8,Couleur.bleu);
		rec.affiche();
		
		

	}
}
