package exercicios;

import java.util.Enumeration;
import java.util.Vector;

public class copiaVetores {
	
	public static void main(String[] args) {
		Vector<Integer> val = new Vector<Integer>();	
		
		val.addElement(10);
		val.addElement(15);
		val.addElement(20);
		
		Vector<Integer> val2 = new Vector<Integer>();	
		
		val2.addElement(20);
		val2.addElement(25);
		val2.addElement(30);
		
		if(val2.addAll(val)){;
		System.out.println("Valores inseridos");
		}
		
		for(Enumeration e = val2.elements(); 
				e.hasMoreElements();) {
			int valor = (Integer) e.nextElement();
			System.out.println(valor + " ");
		}
		
		
		
	}

}
