package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		//Generics
		LinkedList <Conta>lista = new LinkedList<Conta>();
		
		
		Conta cc = new ContaCorrente(11, 11);		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);		
		//lista.add(cc3);
		
		boolean contem = lista.contains(cc3);
		
		System.out.println("Já existe: " + contem);

		
		for(Conta c: lista) {
			System.out.println(c);
		}
		
	}

}
