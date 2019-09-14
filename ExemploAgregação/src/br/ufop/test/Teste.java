package br.ufop.test;

import br.ufop.carro.Carro;
import br.ufop.pessoa.Pessoa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro("punto", 2015, "preto");
		Pessoa pessoa = new Pessoa("José", "23456-3", carro);
		System.out.println(pessoa);

	}

}
