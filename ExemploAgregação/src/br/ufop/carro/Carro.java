package br.ufop.carro;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;
	
	public Carro(String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro: modelo=" + modelo + ", ano=" + ano + ", cor=" + cor;
	}
	
	

}
