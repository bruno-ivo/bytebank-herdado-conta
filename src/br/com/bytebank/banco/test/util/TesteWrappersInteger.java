package br.com.bytebank.banco.test.util;

public class TesteWrappersInteger {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		
		int valor = idadeRef.intValue();
		System.out.println(valor);
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
	}

}
