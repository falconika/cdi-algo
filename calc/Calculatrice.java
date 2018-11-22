package calc;

import java.util.Random;

public class Calculatrice {

		public static int addition(int parametreX, int parametreY){
			return parametreX+parametreY;
		
		}
		public static int soustraction(int parametreX, int parametreY){
			return parametreX-parametreY;
		
		}
		public static int multiplication(int parametreX, int parametreY){
			return parametreX*parametreY;
		
		}
		public static int max(int parametreX, int parametreY){
			if (parametreX>=parametreY)
				return parametreX ;
			if (parametreX<parametreY)
				return parametreY;
			return parametreY;
		
		
		}
		public static char signe(int parametreX){
			if(parametreX>=0)
				return '+';
			else 
				return '-';
		}
		public static long factorielle(int parametreX ){
			if (parametreX==0) {return 0;
				
			}
		int f = parametreX;
		for (int i= parametreX-1;i>1 ; i--) {
			f=f*i;
		}
		return f;
		}
		public static boolean conjonction(boolean boolA, boolean boulB) {
			return boolA && boulB;
			
		}
		public static boolean disjonction(boolean boolA, boolean boulB) {
			return boolA || boulB;
			
		}
		public static boolean negation(boolean boolA) {
			return !boolA ;
			
		}
		public static boolean disjonctionExclusive(boolean boolA, boolean boolB){
			return (boolA &&  !boolB) || (!boolA || boolB);
			
		}
		public static int aleatoireInferieur(int max) {
			return new Random().nextInt(max);
		}
}


		



	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	
//		System.out.println("Entrez un entier : ");
//		int nb1 = sc.nextInt();
//		System.out.println("Entrez un opérateur : ");
//		String operateur = sc.next();
//		sc.nextLine();
//		System.out.println("Entrez un entier : ");
//		int nb2 = sc.nextInt();
//	
//		switch (operateur) {
//		case "+":
//			System.out.println((nb1+nb2));
//			break;
//		case "-":
//			System.out.println((nb1-nb2));
//
//			break;
//		case "*":
//			System.out.println((nb1*nb2));
//
//			break;
//		case "/":
//			System.out.println((nb1/nb2));
//
//			break;
//		default:
//			System.out.println("error");
//			break;
//		}
//		sc.close();
//		
//	}

