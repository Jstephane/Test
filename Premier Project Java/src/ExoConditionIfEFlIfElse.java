
public class ExoConditionIfEFlIfElse {
	public static void main(String[] args) {


		double maNoteJava = 14;
		double maNoteHTML = 13;
		double maNoteJAVAScript = 9;
		double maNoteCSS =7.5;
		int CoefJava=3;
		int CoefHtml=2;
		int CoefJAVAscript=3;
		int CoefCSS=1;	
		int TotalCoef =CoefJava + CoefHtml + CoefJAVAscript + CoefCSS;
		double maNoteTotale =maNoteJava * CoefJava + maNoteHTML* CoefHtml+ maNoteJAVAScript*CoefJAVAscript + maNoteCSS*CoefCSS;
		double  maMoyenne= maNoteTotale / TotalCoef;

		System.out.println("La moyenne =  :" + maMoyenne );
		if( maMoyenne > 18) { 
			System.out.println("La moyenne > 18 : Tres Bien "); 
		}else if( maMoyenne > 15) { 
			System.out.println("La moyenne > 15 : Bien ");}

		else if( maMoyenne > 12) { 
			System.out.println("La moyenne > 12 : Assez Bien " );


		} else if (maMoyenne >10 ){ 
			System.out.println("La moyenne > 10 : Moyen " );
		} else if (maMoyenne > 8 )  { 
			System.out.println("La moyenne > 8 : Peut Faire Mieux " );
		} else if (maMoyenne > 5 ) { 
			System.out.println("La moyenne > 5 : Il Faut Plus De Travail " );}

		else {

			System.out.println(" A L'Ann�e Prochaine "); } 
		int mois = 5;
		 
		  
		 switch (mois) {
	    
	    case 1:
	    System.out.println("Le Mois 1 = Janvier ");
		 break;
		 
		 case 2:
		 System.out.println("Le Mois 2 =Fevrier ");
		 
		  case 3:
		 System.out.println("Le Mois 3 = Mars");
		 break;
		  case 4:
		 System.out.println("Le Mois 4 = Avril ");
		 break;
		 
		  case 5:
		 System.out.println("Le Mois 5 = Mai ");
		 break;
		 
		  case 6:
		 System.out.println("Le Mois 6 = Juin ");
		 break;
		 
		  case 7:
		 System.out.println("Le Mois 7 = Juillet ");
		 break;
		 
		  case 8:
		System.out.println("Le Mois 8 = Aout ");
		 break;
		 
		  case 9:
		 System.out.println("Le Mois 9 = Septembre ");
		 break;
		  case 10:
		 System.out.println("Le Mois 10 = Octobre ");
		 break;
		 
		  case 11:
		 System.out.println("Le Mois 11 = Novembre ");
		 break;
		  case 12:
		 System.out.println("Le Mois 12 = Decembre ");
		 break;
		 
		 default: 
		 System.out.println("Il n' ya que 12 Mois");
		 
		 
		 }
		 

	}
	}

	
	

