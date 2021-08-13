package exercicios;

import java.util.Scanner;

public class SorteiaSomaValida {
	
	public static void main(String[] args) {
		int n1 = (int)(Math.random() * 11);
		int n2 = (int)(Math.random() * 11);
		
		System.out.println("Digite o resulta de: "+n1 + " + " + n2);
		Scanner entrada = new Scanner(System.in);
		int resposta = entrada.nextInt();
		int soma = n1 + n2;
		if(resposta == soma) {
			System.out.println("Correto");
		}else {
			System.out.println("Errado! \nSoma correta = "+ soma);
		}
		
		
	}

}
