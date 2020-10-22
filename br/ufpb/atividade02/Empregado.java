package br.ufpb.atividade02;

public class Empregado extends Pessoa{
	
	private double Salario;
	
	public Empregado(String nome, String telefone, String endereco, double salario) {
		super(nome, telefone, endereco);
		Salario = salario;
	}
	
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
}
