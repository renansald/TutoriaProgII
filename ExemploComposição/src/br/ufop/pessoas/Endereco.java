package br.ufop.pessoas;

public class Endereco {
	private String rua;
	private String bairro;
	private int numero;
	private String cidade;
	private String cep;
	
	public Endereco(String rua, String bairro, int numero, String cidade, String cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco: rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", cep="
				+ cep;
	}
	
}
