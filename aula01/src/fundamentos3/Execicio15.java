package fundamentos3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Execicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		StringTokenizer exemplo = new StringTokenizer ( 
				entrada.nextLine()
				);
		System.out.println(exemplo.countTokens());
	}

}
