package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of trigalge Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		System.out.printf("Triagle X area: %.4f%n",areaX);
		System.out.printf("Triagle Y area: %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
		
	}

}
