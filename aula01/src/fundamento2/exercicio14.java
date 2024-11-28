package fundamento2;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult5=0;
		int mult3=0;
		int somatotal=0;
		for (int i = 1; i < 20; i++) { 
			if (i % 3 == 0) {
			mult3+=i;
			
			if (i % 5 == 0) {
				mult5+=i;
				  
				somatotal=mult3+mult5;
			 System.out.println("mult3:"+mult3);
			 System.out.println("mult5:"+mult5);
			System.out.println("soma total de 3 e 5: " +somatotal);
	}
			}
		}
	}
}
