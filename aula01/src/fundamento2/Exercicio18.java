package fundamento2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner entrada = new Scanner(System.in);
	 
	 int [] a = new int [1];
     int [] b = new int [1];
     int [] c = new int [1];
     int [] d = new int [1];
     int [] e = new int [1];
     int media = 0;
   
  
	 System.out.println(entrada.nextInt());
       
	      for (int i = 0; i < a.length; i++) {
	    	  System.out.println("digite sua nota");
	    	  a[i] = entrada.nextInt();
	    	  
	    	  System.out.println("digite sua nota");
	    	  b[i] = entrada.nextInt();
	    	  
	    	  System.out.println("digite sua nota");
	    	  c[i] = entrada.nextInt();
	    	  
	    	  System.out.println("digite sua nota");
	    	  d[i] = entrada.nextInt();
	    	  
	    	  System.out.println("digite sua nota");
	    	  e[i] = entrada.nextInt();
	    	  
	    	  media = (a[0] + b [0] + c [0] + d[0] + e[0]) / 5;
	    	  
	      }

    	  System.out.println("esse é o resultado"+ media);
      }  
	}

