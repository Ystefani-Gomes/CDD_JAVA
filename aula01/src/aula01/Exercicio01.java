package aula01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	      System.out.println("Digite um numero:");
	      double resp = entrada.nextDouble();
	      
	       if (resp >0) {
	    	   System.out.println("possitivo");
	       } else {
	    	   System.out.println("negativo");
	       }
	}

}
