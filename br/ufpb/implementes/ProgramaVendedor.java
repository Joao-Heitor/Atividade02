package br.ufpb.implementes;

import br.ufpb.atividade02.Vendedor;

public class ProgramaVendedor {
	
	public static void main (String[]args) {
		Vendedor novo = new Vendedor("Joao Lopes","454598","Rua foda",516,68,0.3);
		novo.setEndereco("Rua braba");
		novo.setComiss�o(0.25);
		novo.setSalario(1200);
		System.out.println(novo.toString());
		System.out.printf("Sal�rio (+comiss�o): R$" +novo.CalcularSalario());
	}

}
