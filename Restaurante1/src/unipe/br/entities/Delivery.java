package unipe.br.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Delivery extends Pedido{
	@Column
	private float trocoPara;
	
	@ManyToOne
	private Cliente cliente;
	
	public float getTrocoPara() {
		return trocoPara;
	}
	public void setTrocoPara(float trocoPara) {
		this.trocoPara = trocoPara;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
