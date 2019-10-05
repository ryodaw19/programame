import java.util.*;

public class P362 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int ncasos = sc.nextInt();


			for(int i=0; i < ncasos; i++){
				int dia = sc.nextInt();
				int mes = sc.nextInt();
				
	            if (dia==25 && mes==12){
	                  System.out.println("SI");
	             } else {
	                  System.out.println("NO"); 
	                }
			
		}
			
	}
		
}

