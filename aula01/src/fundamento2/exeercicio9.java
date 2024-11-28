package fundamento2;

import java.util.Scanner;

public class exeercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qAlunos=0;
		int cont=0;
		double notas=0,media=0;
		
          Scanner ent = new Scanner (System.in);
          System.out.println("Digite a quantidade de aluno");
          qAlunos = ent.nextInt();
          
          while(cont < qAlunos) {
        	  System.out.println("digite nota");
        	  notas+= ent.nextDouble(); 
        	  cont++;
          }
          double result=notas/qAlunos;
          System.out.println(result);
	}



}

