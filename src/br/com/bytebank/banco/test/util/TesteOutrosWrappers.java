package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(19);//Autoboxing
		System.out.println(idadeRef.intValue()); //Unboxing
		
		Double dRef = Double.valueOf(3.2); //Autoboxing
		System.out.println(dRef.doubleValue()); //Unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.9f);
		System.out.println(refNumero.floatValue());
		
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(23.2);
	}

}
