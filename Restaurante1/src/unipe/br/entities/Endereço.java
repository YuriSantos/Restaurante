package unipe.br.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereço {
	@Column(length=100)
	private String rua;	
	
	@Column(length=25)
	private String bairro;
	
	@Column(length=11)
	private String cep;
	
	@Column(length=15)
	private String numero;
	
	@Column(length=50)
	private String complemento;
	
	@Column(length=12)
	private String telefone;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
