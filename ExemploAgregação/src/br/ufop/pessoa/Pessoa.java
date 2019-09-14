package br.ufop.pessoa;

import br.ufop.carro.Carro;

public class Pessoa {
	private String nome;
	private String cnh;
	private Carro carro;
	
	public Pessoa(String nome, String cnh, Carro carro) {
		this.nome = nome;
		this.cnh = cnh;
		this.carro = carro; /*Aqui um exemplo de agre��o, 
		pois a classe 
		pessoa n�o vai contruir um carro 
		no seu construtor, 
		o carro � um objeto recebido j� inst�nciado*/
	}

	@Override
	public String toString() {
		return "Pessoa: nome=" + nome + ", cnh=" + cnh + ", tem " + carro + "]";
	}
	
}
