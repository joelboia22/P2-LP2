package br.com.lista2.q2.empresa;

public class Empregado {
	private String nome;
	protected float salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "O " + nome +  " recebe " +salario;
	}

}
