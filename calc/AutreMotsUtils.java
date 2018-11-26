package calc;
import java.util.Collections;
import java.util.Random;


public class AutreMotsUtils {
	
	public static String prochainImpair(int param, int param2) {
		StringBuilder res= new StringBuilder() ;
		int resultat;
		
		if (param%2==0) {
		 resultat=param-1;
		} else { resultat= param ;
		}
		
		
		for (int i=0; i<param2;i++) {
			
				resultat = resultat + 2;
			if(i==(param2-1)) {
			res=res.append(resultat+"");
			}else {
				res=res.append(resultat+"*");
			}
		}
		return res.toString();
		
	}
}
