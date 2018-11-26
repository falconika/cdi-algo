package exec;

import calc.*;

import tools.Clavier;

public class Exercices {

	public static void main(String[] args) {
		//	Exercices.exercice1();
		//	Exercices.exercice2();
		//	Exercices.exercice3();
		//	Exercices.exercice4();
		//	Exercices.exercice5();
		//	Exercices.exercice6();
		//	Exercices.exercice7();
		//	Exercices.exercice7bis();
		//	Exercices.exercice8();
		//  Exercices.exercice9();
		// 	Exercices.exercice10();
		//  Exercices.exercice11();
		// 	Exercices.exercice12();
		//  Exercices.exercice13();
		//  Exercices.exercice13bis();
		//  Exercices.exercice14();
		//  Exercices.exercice15();
		//  Exercices.exercice16();
		//  Exercices.exercice17();
		//  Exercices.exercice18();
		// 	Exercices.exercice19();
		// 	Exercices.exercice20();
		//  Exercices.exercice21();
		//  Exercices.exercice22();
		//  Exercices.exercice25();
		//  Exercices.exercice28();
		//  Exercices.exercice23();
		//  Exercices.exercice34();
		//		Exercices.exercice35();
		//		Exercices.exercice29();
//				Exercices.exercice26();
//		Exercices.exercice27();
		Exercices.exercice30();





	}

	public static void exercice1() {
		System.out.println("*************************************");
		System.out.println("Addition deux entiers : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.addition(parametreX, parametreY);
		System.out.println("la somme = " + res);
	} 
	public static void exercice2() {
		System.out.println("*************************************");
		System.out.println("Soustraction deux entiers : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.soustraction(parametreX, parametreY);
		System.out.println("la soustraction = " + res);
	}
	public static void exercice3() {
		System.out.println("*************************************");
		System.out.println("Multiplication deux entier : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.multiplication(parametreX, parametreY);
		System.out.println("la multiplication = " + res);
	}
	public static void exercice4() {
		System.out.println("*************************************");
		System.out.println("Maximum deux entier : ");
		int parametreX = Clavier.lireInt();
		int parametreY = Clavier.lireInt();
		int res = Calculatrice.max(parametreX, parametreY);
		System.out.println("le plus grand nombre = " + res);
	}
	public static void exercice5() {
		System.out.println("*************************************");
		System.out.println("Signe d'un entier : ");
		int parametreX = Clavier.lireInt();
		char res = Calculatrice.signe(parametreX);
		System.out.println("le signe = " + res);
	}
	public static void exercice6() {
		System.out.println("*************************************");
		System.out.println("Somme tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int res = CalculatriceTableau.sommeElements(tabInt);
		System.out.println("la somme = " + res);
	}
	public static void exercice7() {
		System.out.println("*************************************");
		System.out.println("Plus petit element d'un tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int res = CalculatriceTableau.plusPetitElement(tabInt);
		System.out.println("Plus petit element = " + res);
	}
	public static void exercice7bis() {
		System.out.println("*************************************");
		System.out.println("Plus grand element d'un tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int res = CalculatriceTableau.plusGrandElement(tabInt);
		System.out.println("Plus grand element = " + res);
	}
	public static void exercice8() {
		System.out.println("*************************************");
		System.out.println("Somme de tous les �l�mens de 2 tableaux de 5 entiers : ");
		System.out.println("*** Premier tableau");
		int[] tabInt = Clavier.lireTableauInt(5);
		System.out.println("*** Deuxieme tableau");
		int[] tabInt2 = Clavier.lireTableauInt(5);
		long res = CalculatriceTableau.sommeElementsDeuxTableaux(tabInt, tabInt2);
		System.out.println("la somme = " + res);
	}
	public static void exercice9() {
		System.out.println("*************************************");
		System.out.println("Tri ascendant d'un tableau de 5 elements : ");
		int[] tabInt = Clavier.lireTableauInt(5);
		int[] res = CalculatriceTableau.triAscendant(tabInt);
		System.out.println("le tableau tri� = " + Clavier.contenuTableau(res));
	}
	public static void exercice10() {
		System.out.println("*************************************");
		System.out.println("Factorielle d'un entier : ");
		int parametreX = Clavier.lireInt();
		long res = Calculatrice.factorielle(parametreX);
		System.out.println("factorielle = " + res);
	}
	public static void exercice11() {
		System.out.println("*************************************");
		System.out.println("Conjonction (le and logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean boolB = Clavier.lireBoolean();
		boolean res = Calculatrice.conjonction(boolA, boolB);
		System.out.println("conjonction = " + res);
	}
	public static void exercice12() {
		System.out.println("*************************************");
		System.out.println("disjonction (le or logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean boolB = Clavier.lireBoolean();
		boolean res = Calculatrice.disjonction(boolA, boolB);
		System.out.println("disjonction = " + res);
	}
	public static void exercice13() {
		System.out.println("*************************************");
		System.out.println("negation (l'inverse logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean res = Calculatrice.negation(boolA);
		System.out.println("negation = " + res);
	}
	public static void exercice13bis() {
		System.out.println("*************************************");
		System.out.println("disjonction exclusive (le xor logique)");
		boolean boolA = Clavier.lireBoolean();
		boolean boolB = Clavier.lireBoolean();
		boolean res = Calculatrice.disjonctionExclusive(boolA, boolB);
		System.out.println("disjonction exclusive = " + res);
	}
	public static void exercice14() {
		System.out.println("*************************************");
		System.out.println("Conjonction d'un tableau de 5 elements boolean ");
		boolean[] tabBool = Clavier.lireTableauBoolean(5);
		System.out.println("conjonction = " + CalculatriceTableau.conjonction(tabBool));
	}
	public static void exercice15() {
		System.out.println("*************************************");
		System.out.println("Trier les �l�mens de 2 tableaux de 5 entiers : ");
		System.out.println("*** Premier tableau");
		int[] tabInt = Clavier.lireTableauInt(5);
		System.out.println("*** Deuxieme tableau");
		int[] tabInt2 = Clavier.lireTableauInt(5);
		int[] res = CalculatriceTableau.triAscendantDeuxTableaux(tabInt, tabInt2);
		System.out.println("tri des 2 tableaux = " + Clavier.contenuTableau(res));
	}
	public static void exercice16() {
		System.out.println("*************************************");
		System.out.println("Rechercher le nombre d'element pair dans un tableau : ");
		int[] tab = Clavier.lireTableauInt(6);
		long res = CalculatriceTableau.nombreDElementsPair(tab);
		System.out.println("nombre d element pair = " + res);
	}
	public static void exercice17() {
		System.out.println("*************************************");
		System.out.println("Rechercher si un element existe ou pas : ");
		int[] tab = Clavier.lireTableauInt(4);
		System.out.println("Saisir l'element � chercher");
		int param = Clavier.lireInt();
		boolean res = CalculatriceTableau.chercheSiUnElementExiste(param, tab);
		System.out.println("L element existe ? = " + res);
	}
	public static void exercice18() {
		System.out.println("*************************************");
		System.out.println("Methode qui met 0 dans les cases � indice impair d'un tableau : ");
		int[] tab = Clavier.lireTableauInt(6);
		int[] res = CalculatriceTableau.mettreZeroDansLesCasesAIndicesImpair(tab);
		System.out.println("Le tableau = " + Clavier.contenuTableau(res));
	}
	public static void exercice19() {
		System.out.println("*************************************");
		System.out.println("Methode qui decale les elements d un tableau d une case vers la droite : ");
		int[] tab = Clavier.lireTableauInt(6);
		int[] res = CalculatriceTableau.decalerLesElementsTableauDUneCase(tab);
		System.out.println("Le tableau = " + Clavier.contenuTableau(res));
	}
	public static void exercice20() {
		System.out.println("*************************************");
		System.out.println("Methode qui inverse un mot saisi (abc --> cba) : ");
		String str = Clavier.lireString();
		String res = MotsUtils.inverser(str);
		System.out.println("l'inverse du mot " + str + " est " + res);
	}
	public static void exercice21() {
		System.out.println("*************************************");
		System.out.println("Methode qui retourne tous les caracteres communs entre 2 String : ");
		String str = Clavier.lireString();
		String str2 = Clavier.lireString();
		String res = MotsUtils.caracteresCommuns(str, str2);
		System.out.println("les caractere communs entre " + str + " et " + str2 + " sont " + res);
	}
	public static void exercice22() {
		System.out.println("*************************************");
		System.out.println("Methode qui v�rifie si un mot est un palindrome : ");
		String str = Clavier.lireString();
		boolean res = MotsUtils.estUnPalindrome(str);
		if (res) {
			System.out.println("le mot " + str + " est un palindrome ");
		} else {
			System.out.println("le mot " + str + " n'est pas un palindrome ");
		}
	}
	public static void exercice25() {
		System.out.println("*************************************");
		System.out.println("Methode qui calcule la somme des chiffres contenus dans un mot 'a3ji2' --> 5 :");
		String str = Clavier.lireString();
		long res = MotsUtils.sommeChiffresDansMot(str);
		System.out.println("La somme des chiffres : " + res);
	}
	/**
	 * cr�er une methode qui prend en parametre un entier strictement positif et qui
	 * affiche ceci si parametre est 4 alors affiche 83 si parametre est 11 alors
	 * affiche 2210 si parametre est 23 alors affiche 4622
	 */
	public static void exercice28() {
		System.out.println("*************************************");
		System.out.println("methode qui prend en parametre un entier strictement positif et qui affiche :");
		int param = Clavier.lireInt();
		String res = MotsUtils.doubleAndSoustract(param);
		System.out.println("Le resultat pour " + param + " est : " + res);
	}
	public static void exercice23() {
		System.out.println("*************************************");
		System.out.println("Methode qui affiche le nombre d'occurence des caracteres : ");
		String str = Clavier.lireString();
		System.out.println("les occurences des lettres dans le mot : " + str);
		MotsUtils.afficherNombreOccurence(str);
	}
	public static void exercice34() {
		System.out.println("*************************************");
		System.out.println("Methode demande de saisir un entier et affiche un nombre al�atoire inf�rieur : ");
		int max = Clavier.lireInt();
		int alea = Calculatrice.aleatoireInferieur(max);
		System.out.println("Un nombre al�atoire inf�rieur � : " + max + " : " + alea);
	}



	public static void exercice29() {
		System.out.println("*************************************");
		System.out.println("une methode qui prend deux parametres de type entier strictement positif et qui affiche :");
		int param = Clavier.lireInt();
		int param2 = Clavier.lireInt();
		String res = AutreMotsUtils.prochainImpair(param, param2);
		System.out.println("Le resultat pour " + param + " est : " + res);
	}
	public static void exercice26() {
		System.out.println("*************************************");
		System.out.println("Methode qui calcule la somme des codes unicodes des caracteres du string  :");
		String str = Clavier.lireString();
		long res = MotsUtils.sommeUnicodes(str);
		System.out.println("La somme des unicodes : " + res);
	}
	public static void exercice30() {
		System.out.println("*************************************");
		System.out.println("Inscrivez un nombre � virgule :");
		int str = Clavier.lireInt();
		String res = MotsUtils.ted(str);
		System.out.println("Ted =" + res);
	}
	


}