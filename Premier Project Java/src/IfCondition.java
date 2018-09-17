
public class IfCondition {

	public static void main(String[] args) {


		int Prix = 10;
		if(Prix == 10); { 
			System.out.println("Le Prix = 10 ");
		}
		int TVA = 20;
		if(TVA == 15);   { 
			System.out.println("La TVA = 15 ");
		}
		Boolean Bool = true;
		if(Bool==false); { 
			System.out.println("Le Variable Bool = False ");
		}

		if(Bool==true); { 
			System.out.println("Le Variable Bool = True ");
		}

		char car = 'a';

		if ( car == 'c'); { 
			System.out.println("Le Variable caractere = c ");
		}
		if ( car =='a'); { 
			System.out.println("Le Variable caractere = 'a' ");

		}
		String chaine = "Bonjour";
		if ( chaine =="Bonjour"); { 
			System.out.println("Le Variable chaine = Bonjour");
		}
		if ( chaine =="bonjour"); { 
			System.out.println("Le Variable chaine = bonjour");
		}
		
		double decimal = 15.5;
		if ( decimal ==15.5); { 
			System.out.println("Le Variable decimal = 15.5");
		}
		if ( decimal ==10.65); { 
			System.out.println("Le Variable decimal = 10.65");
		}
		
		int Somme = 15;
		if ( Somme > 11); { 
			System.out.println("Le Produit est trop Cher");
		    }
		
	    if ( Somme<= 11); { 
				System.out.println("La Somme est Parfaite");
			}	
	    
	    if ( Somme!= 13); { 
			System.out.println("La Somme est !=13");

		}
	}
}

