package br.ufop.teste;

import br.ufop.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jo�o", 23, "123456789", 1000.9f);
		System.out.println("Nome: " + cliente.getNome()+
				" Idade: "+cliente.getIdade()+" CPF: "+cliente.getCpf()+" Cr�dito: "+ cliente.getCredito());

	}

}
