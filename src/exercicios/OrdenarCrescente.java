package exercicios;

import java.util.Scanner;

public class OrdenarCrescente {
	
 public static void main(String[] args) {
		
	 	Scanner entrada = new Scanner(System.in);
		int nro[] = new int[10];
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe Nro de indice:" + i);
			nro[i] = entrada.nextInt();
		}
		
		int seq;
		for(int j = 0;j < nro.length; j++) {
			for(int i = nro.length - 1; i > 0 ; i--) {
				  if( nro[i] < nro[i - 1]) {
					  seq        = nro[i];
					  nro[i]     = nro[i - 1];
					  nro[i - 1] = seq;
				  }
			}
		}
		
		for(int i = 0; i <nro.length; i++) {
			System.out.println(nro[i]);
		}
		

 	}

}


