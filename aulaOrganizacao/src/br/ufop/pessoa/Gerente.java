package br.ufop.pessoa;

public class Gerente {

	private String nome;
	private int registro;
	private double salarioBase;
	
	public Gerente(String nome, int registro, double salarioBase) {
		this.nome = nome;
		this.registro = registro;
		setSalarioBase(salarioBase);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if(salarioBase < 995.00) {
			System.out.println("O salário dever ser igual o minímo. Por padrão o funcionário recebrá o minímo");
			this.salarioBase = 995;
			return;
		}
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioLiquido() {
		return salarioBase * 1.05;
	}
	
	
	
}
