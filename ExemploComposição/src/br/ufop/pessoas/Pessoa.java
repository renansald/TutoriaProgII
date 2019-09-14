package br.ufop.pessoas;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	
	
	public Pessoa(String nome, String cpf, String rua, String bairro, int numero, String cidade, String cep) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = new Endereco(rua, bairro, numero, cidade, cep);/*Objeto criado dentro da classe,
		quando o objeto da classe pessoa deixar de existir
		o objeto do endereço também deixa de existir*/
	}



	@Override
	public String toString() {
		return "nome=" + nome + ", cpf=" + cpf + ", " + endereco;
	}
}
