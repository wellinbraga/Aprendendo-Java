package exercicios;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tabualda de qual Nro?");
		int vlr = entrada.nextInt();
		int result =0;
		
		System.out.println("\nAdição");
		for (int s = 0; s <= 10; s++) {
			result = vlr + s;
			System.out.printf("%d + %d = %d\n",vlr,s,result);
		}
		
		System.out.println("\nSubtração");
		for (int st = 0; st <=10 ; st++) {
			result =  st + vlr;
			System.out.printf("%d - %d = %d\n",result,vlr,st);
					
		}
		
		System.out.println("\nMultiplicação");
		for (int m = 1; m <=10 ; m++) {
			result = vlr * m;
			System.out.printf("%d X %d = %d\n ",m,vlr,result);
			
		}		
		
		
		System.out.println("\nDivisão");
		for (int d = 1; d <= 10 ; d++) {
			result = vlr * d;
			System.out.printf("%d : %d = %d\n",result,vlr,d);
			
		}		
		
		
		
		
	}

}
