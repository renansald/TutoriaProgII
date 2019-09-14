package br.ufop;

public class Cliente extends Pessoa {
	
	private float credito;
	
	public Cliente(String nome, int idade, String cpf, float credito) {
		super(nome, idade, cpf);
		this.credito = credito;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
}
