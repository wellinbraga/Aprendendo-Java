package exercicios;

import java.util.Scanner;

public class TesteFuncao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		entrada.close();
	}

	private static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		}else if(b > c) {
			aux = b;
		}else {
			aux = c;
		}
		
		return aux;
	}

	private static void showResult(int value) {
		System.out.println("Higther: " + value);
		
	}


}
