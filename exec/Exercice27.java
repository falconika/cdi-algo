package exec;

import calc.CalcExercice27;
import calc.Calculatrice;
import calc.MotsUtils;
import tools.Clavier;

public class Exercice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercice27.exercice27();
	}
	public static void exercice27() {
		System.out.println("*************************************");
		System.out.println("Ecrivez une suite de 0 et de 1 dans un ordre aléatoire :");
		String str = Clavier.lireString();
		int res= CalcExercice27.exercice27(str);
		System.out.println("voici le résultat:"+ res);
	}
}
