package calc;

import java.util.Collections;
import java.util.Random;

public class MotsUtils {
	public static String inverser(String str) {

		StringBuilder res = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			res.append(str.charAt(i));
		}
		return res.toString();
	}
	public static String caracteresCommuns(String str, String str2) {
		StringBuilder sb = new StringBuilder();

		if (str.length() > str2.length()) {
			String tmp = str2;
			str2 = str;
			str = tmp;
		}

		for (int i = 0; i < str.length(); i++) {
			char seq = str.charAt(i);
			if ((sb.indexOf(seq + "") == -1) && (str2.indexOf(seq) != -1)) {
				sb.append(seq);
			}
		}

		return sb.toString();
	}
	public static Boolean estUnPalindrome(String str) {
		return inverser(str).equals(str);

	}
	public static long sommeChiffresDansMot(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				res += Character.digit(str.charAt(i), 10);
			}
		}
		return res;
	}
	public static String doubleAndSoustract(int param){
		return param*2 + ""+(param-1);

	}

	//	public static String afficherNombreOccurence(String str) {
	//		StringBuilder res = new StringBuilder();
	//////////////////////////////////////////////////					INITIALISATION

	///////////////////////////////////////////////////////////           DECLARATION
	///////////////////////////////////////////////////////////           Parcourir le mot
	///////////////////////////////////////////////////////////           	si occurence==> compteurLettre ++ 
	///////////////////////////////////////////////////////////           	append a resultat= valeur de i se repete compteurLettre
	///////////////////////////////////////////////////////////           parcourir le reste du mot 
	///////////////////////////////////////////////////////////           pour chaque occurence ajouter 		
	///////////////////////////////////////////////////////////           retour		
	//		return res.toString();		
	//	}
	public static void afficherNombreOccurence(String str) {
		StringBuilder sb = new StringBuilder();
		str = str.toLowerCase();
		char seq;
		int nbSeq;
		int idSeq;

		for (int i = 0; i < str.length(); i++) {
			seq = str.charAt(i);
			nbSeq = 0;
			idSeq = 0;

			if (sb.indexOf(seq + "") != -1)
				continue;

			sb.append(seq);

			do {
				if ((idSeq = str.indexOf(seq, idSeq)) == -1)
					break;
				nbSeq++;
				idSeq++;
			} while (idSeq != -1);
			System.out.println(seq + " " + nbSeq);
		}
	}


	public static long sommeUnicodes(String str) {
		long res = 0;
		for (int i = 0; i < str.length(); i++) {
			int unicode =(int) str.charAt(i);
			res = res + unicode;
		}
		return   res;

	}
	
	public static String ted(int param) {
		String str= param +"";
		int total=0;
		int entier=0;
		int decimal=0;
//		calculer entier
		for (int i = 0; i < str.length() ; i++) {
			if(Character.isDigit(str.charAt(i))) {
//				si c'est un nombre j'additionne
				entier= entier+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(entier);
//		calculer decimal
		for (int i = str.length()-i; i > str.length() ; i++) {
			if(Character.isDigit(str.charAt(i))) {
//				si c'est un nombre j'additionne
				decimal= decimal+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(decimal);

//		calculer total
		total= entier+ decimal;
		System.out.println(total);

		String res= "T"+total+"E"+entier+"D"+decimal ;
		return   res;

	}
}
