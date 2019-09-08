package br.ufop.pessoa;

import br.ufop.produtos.Produtos;
/**
 * 
 * @author Renan Saldanha
 *Classe representa um vendedor de uma empresa
 */
public class Vendedor{

	private String nome;
	private int registro;
	private double salarioBase;
	private double vendas = 0;
	
	public Vendedor(String nome, int registro, double salarioBase){
		this.nome = nome;
		this.registro = registro;
		setSalarioBase(salarioBase);
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getRegistro(){
		return registro;
	}

	public void setRegistro(int registro){
		this.registro = registro;
	}

	public double getSalarioBase(){
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase){
		if(salarioBase < 995) {
			System.out.println("O salário não pode ser menor que o minímo");
			this.salarioBase = 995;
			return;
		}
		this.salarioBase = salarioBase;
	}

	public double getVendas(){
		return vendas;
	}
	
	public void setVendas(Produtos produto){
		vendas += produto.getPreco();
	}
	
	/**
	 * 
	 * Retorna o salario liquído do funcionário com comissão 
	 * @return double
	 */
	public double getSalarioLiquído(){
		if(vendas == 0){
			return salarioBase;
		}
		else if(vendas > 0 && vendas < 1000){
			return salarioBase + (vendas * 0.10);
		}
		else if(vendas >= 1000 && vendas < 5000) {
			return salarioBase + (vendas *0.15);
		}
		else {
			return salarioBase + (vendas *0.20);
		}
	}
}
