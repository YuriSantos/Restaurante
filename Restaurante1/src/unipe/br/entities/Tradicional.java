package unipe.br.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(sequenceName="pedido_seq", name="pedido_id", allocationSize=1)
public class Tradicional {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pedido_id")
	private Long id;
	
	@ManyToOne
	private Mesa mesa;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
