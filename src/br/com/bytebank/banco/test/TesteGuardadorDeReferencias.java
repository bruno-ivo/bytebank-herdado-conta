package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
	
	public static void main(String[] args) {
		GuardadorDeReferencias g = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(11, 22);		
		g.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(11, 20);		
		g.adiciona(cc2);
		
		int tamanho = g.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) g.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
