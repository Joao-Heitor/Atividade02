package br.ufpb.implementes;

import br.ufpb.atividade02.Fornecedor;

public class ProgramaFornecedor {
	
	public static void main(String[]args) {
		
		Fornecedor novo = new Fornecedor("heitor","12","Rua",6548,4684);
		novo.setNome("heitor");
		novo.setTelefone("9887");
		novo.setEndereco("Rua antonio");
		System.out.println(novo.toString());
		System.out.println("Crédito: R$" +novo.getValorCredito()+"     Dívida: R$"+novo.getValorDivida());
		System.out.printf("Saldo: R$" +novo.obterSaldo());
	}
}