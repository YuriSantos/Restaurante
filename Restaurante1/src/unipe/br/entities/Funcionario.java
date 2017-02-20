package unipe.br.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario  extends Usuario{
	
	@Column
	private float salario;
	
	@Column(name="cpf", unique=true, length=14, nullable=false)
	private String cpf;
	
	@Column(length=25)
	private String cargo;
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
