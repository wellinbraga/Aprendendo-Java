package application;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.printf("\nProduct data: %s, R$: %.2f, %d units, Total: R$ %.2f\n", 
				product.name, product.price, product.quantity, product.totalValuesStrock());
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());		
		System.out.printf("Update data: %s, R$: %.2f, %d units, Total: R$ %.2f\n", 
				product.name, product.price, product.quantity, product.totalValuesStrock());
		
		System.out.println("\nEnter the number of products to be removed from sotck: ");
		product.romoveProducts(sc.nextInt());
		System.out.printf("Update data: %s, R$: %.2f, %d units, Total: R$ %.2f\n", 
				product.name, product.price, product.quantity, product.totalValuesStrock());
		
		sc.close();
		
	}

}
