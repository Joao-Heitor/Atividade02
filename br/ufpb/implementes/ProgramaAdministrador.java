package br.ufpb.implementes;

import br.ufpb.atividade02.Administrador;

public class ProgramaAdministrador {
	
	public static void main (String[]args) {
		Administrador novo = new Administrador("joao", "7777", "Rua", 4521,598);
		novo.setSalario(2150);
		novo.setEndereco("Rua A");
		novo.setTelefone("8779");
		System.out.println(novo.toString());
		System.out.printf("Salário (+benefícios): R$" +novo.CalcularSalario());
	}

}