package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//Generics
		ArrayList <Conta>lista = new ArrayList<Conta>();
		
		//ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(11, 22);		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(11, 20);		
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(311, 222);		
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(211, 220);		
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------");
		
		for(Conta c: lista) {
			System.out.println(c);
		}
		
	}

}
