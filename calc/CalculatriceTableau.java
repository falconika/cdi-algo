package calc;

public class CalculatriceTableau {
	public static int sommeElements(int[] tab ){
		int resultat=0;
		for(int i = 0 ; i < tab.length ; i++   ) {
			resultat= resultat + tab[i];
		}
		return resultat;
		
	
	}
	public static int plusPetitElement(int[] tab ){
		int resultat=tab[0];
		for(int i = 0 ; i < tab.length ; i++   ) {
			if (tab[i]<=resultat)
			resultat= tab[i];
		}
		return resultat;
		
	
	}
	public static int plusGrandElement(int[] tab ){
		int resultat=tab[0];
		for(int i = 0 ; i < tab.length ; i++   ) {
			if (tab[i]>=resultat)
			resultat= tab[i];
		}
		return resultat;
		

	}
	public static int sommeElementsDeuxTableaux(int tabInt[],int tabInt2[] ){
		
		return sommeElements(tabInt)+sommeElements(tabInt2);

	}
	public static int[] triAscendant(int[] tabInt) {
		// int test = tabInt[0];
		int aide;
		for (int i = 0; i < tabInt.length; i++) {
			for (int j = i + 1; j < tabInt.length; j++) {
				if (tabInt[i] > tabInt[j]) {
					aide = tabInt[i];
					tabInt[i] = tabInt[j];
					tabInt[j] = aide;
				}

			}
		}

		return tabInt;
	}
	public static boolean conjonction (boolean[] tabBool) {
		boolean res=true;
		for (int i = 1; i < tabBool.length; i++) {			
			res= res && Calculatrice.conjonction(tabBool[i-1], tabBool[i]);
			}
		return res;
	}
	public static int[] triAscendantDeuxTableaux(int[] tabInt1, int[]tabInt2) {
		int tailleTableauR = tabInt1.length+tabInt2.length;
		int[] tabR = new int[tailleTableauR];
		System.arraycopy(tabInt1, 0, tabR, 0, tailleTableauR);
		System.arraycopy(tabInt2, 0, tabR, tabInt1.length, tabInt2.length);
		return triAscendant(tabR);
		}
//															nombreDElementsPair
	public static long nombreDElementsPair(int[] tab) {
	long tabPair=0;
//parcourir le tableau
	for (int i = 0; i < tab.length; i++) {
		
//evaluer les nombres
		if(tab[i]%2==0) {
			tabPair++;
		}
//si tabInt1[i]%2=0 alors mettre dans deuxieme tableau
//retourner deuxieme tableau
	}
	return tabPair;
	}
//	 														chercheSiUnElementExiste
	public static boolean chercheSiUnElementExiste(int param, int[]tab) {
		// parcourir le tableau
		for (int i = 0; i < tab.length; i++) {
			if (param==tab[i]){
				 return true;
			}	
		}
		return false;
	}
	// mettreZeroDansLesCasesAIndicesImpair
	public static int[] mettreZeroDansLesCasesAIndicesImpair(int []tab) {
		//		parcourir le tableau
		for (int i = 0; i < tab.length; i++) {
			if (!(i%2==0)){
				tab[i]=0;
			}			
		}
		return tab;
	}
	
	public static int[] decalerLesElementsTableauDUneCase(int[] tab) {
//		parcourir le tableau
		int aide=tab[tab.length-1];
		for (int i = 1; i < tab.length ; i++) {
			tab[tab.length-i]=tab[tab.length-i-1];
		}
		tab[0]=aide;
		
		return tab;
	}
	
	}
