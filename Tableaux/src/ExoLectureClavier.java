import java.util.Scanner;

public class ExoLectureClavier {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Debut : ");	
		int Debut = sc.nextInt();
		System.out.println("Fin : ");	
		int Fin = sc.nextInt();
		
		
		while (Debut <= Fin ) {
			System.out.println("Debut = " + Debut);
			Debut++;
			
			
		} 
			
            sc.close();

		}


	}
