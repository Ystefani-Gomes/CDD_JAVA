package fundamentos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner entrada= new Scanner (System.in);
      System.out.println("digite a primeira nota");
      Double nota1 = entrada.nextDouble();
      
      System.out.println("digite a segunda nota");
      Double nota2 = entrada.nextDouble();
      
      Double media = nota1+nota2/2;
      
      System.out.println("a media do aluno é: "+media);
	}

}
