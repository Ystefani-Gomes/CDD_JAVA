package fundamentos;

import java.util.Scanner;

public class Exercicio05 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner entrada = new Scanner (System.in);
       System.out.println("digite F ou M: ");
       char Gene = entrada.next().charAt(0);
       if (Gene == 'F'|| Gene== 'f') {
    	   System.out.println("Feminino");
       } else if (Gene == 'M' || Gene== 'm') {
    	   System.out.println("Maculino");
       }
       else {
    	   System.out.println("Erro Digite F ou M");
       }
	} 

}
