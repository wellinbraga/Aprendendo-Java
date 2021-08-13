package exercicios;

	/*4. Supondo que a população de um país A seja da ordem de 80000
	habitantes com uma taxa anual de crescimento de 3% e que a
	população de B seja 200000 habitantes com uma taxa de crescimento
	de 1.5%. Faça um programa que calcule e escreva o número de anos
	necessários para que a população do país A ultrapasse ou iguale a
	população do país B, mantidas as taxas de crescimento.
	 */

public class Exec4Aula17 {
	public static void main(String[] args) {
		
	
	
	int paisA =  80000;
	int paisB = 200000;
	int i = 0;
	for( ;paisA < paisB; i++ ) {
		System.out.println("paisA: " + paisA);
		System.out.println("paisB: " + paisB);
		paisA += paisA * 0.03; 
		paisB += paisB * 0.015;
		System.out.println("paisA: " + paisA);
		System.out.println("paisB: " + paisB);
	}
	
	System.out.println("Anos: " + i);
	System.out.println("paisA: " + paisA);
	System.out.println("paisB: " + paisB);
	
	}	
	
}
