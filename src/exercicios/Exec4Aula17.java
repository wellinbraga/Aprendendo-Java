package exercicios;

	/*4. Supondo que a popula��o de um pa�s A seja da ordem de 80000
	habitantes com uma taxa anual de crescimento de 3% e que a
	popula��o de B seja 200000 habitantes com uma taxa de crescimento
	de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos
	necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a
	popula��o do pa�s B, mantidas as taxas de crescimento.
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
