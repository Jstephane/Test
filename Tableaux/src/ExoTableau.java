
public class ExoTableau {

	public static void main(String[] args) {

		String cours [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", "NET", "Typescript", "Golang", "Scala", "Kotlin"};
		for (int i = 0; i < cours.length; i++) {
 			System.out.println(cours[i]); 
	}
		System.out.print("Matiere  : ");
		for (int i = 0; i < cours.length; i++) {
 			
			
 			if(i<cours.length -1) {
				System.out.print(cours[i]+ " = " + "10" +   " , ");
				
			}
 			
		
		
		else{
			System.out.print(cours[i] + "=" +  "10" ) ;
				
				
			}
 			
 			
		}
		
	}
 		
}
		
		
	



