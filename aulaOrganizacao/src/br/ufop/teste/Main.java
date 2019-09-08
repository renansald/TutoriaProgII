package br.ufop.teste;

import br.ufop.pessoa.Gerente;
import br.ufop.pessoa.Vendedor;
import br.ufop.produtos.Produtos;

public class Main {

	public static void main(String[] args) {
		
		Produtos notebook = new Produtos("notebook", 2000);
		Produtos celular = new Produtos("celular", 500.00);
		Produtos pendrive = new Produtos("pendrive", 30);
		Gerente gerente = new Gerente("João", 255, 4000);
		Vendedor vendedor = new Vendedor("Pedro", 171, 2000);
		vendedor.setVendas(celular);
		vendedor.setVendas(notebook);
		vendedor.setVendas(pendrive);
		System.out.println("Vendas do vendedor "+vendedor.getNome()+" foi: "+vendedor.getVendas());
		System.out.println("O salário do vendedor base é: "+vendedor.getSalarioBase()+" Com comissão: "+vendedor.getSalarioLiquído());
		System.out.println("O salário do gerente é: "+gerente.getSalarioBase()+" Com comissão: "+gerente.getSalarioLiquido());
	}

}
