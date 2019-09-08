package br.ufop.produtos;

public class Produtos {

	private String nome;
	private double preco;
	
	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco < 0){
			System.out.println("Não existe produto com valor negativo");
			return;
		}
		this.preco = preco;
	}
	
	
}
