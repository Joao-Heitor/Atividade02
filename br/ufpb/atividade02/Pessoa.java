package br.ufpb.atividade02;

public class Pessoa {

	private String Nome;
	private String Telefone;
	private String Endereco;

	public Pessoa(String nome, String telefone, String endereco) {
		super();
		Nome = nome;
		Telefone = telefone;
		Endereco = endereco;
	}

	public Pessoa() {
		this("", "", "");
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String toString() {
		return "Pessoa [Nome:" + Nome + ", Telefone:" + Telefone + ", Endereço:" + Endereco + "]";
	}

}
