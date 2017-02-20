package unipe.br.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(sequenceName="cliente_seq", name="cliente_id", allocationSize=1)
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_id")
	private Long id;
	
	@Column
	private int quantidade;
	@Column
	private float preco;
	
	@ManyToOne
	private Produtos produto;
	
	@ManyToOne
	private Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produtos getProduto() {
		return produto;
	}
	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Produtos getCardapio() {
		return produto;
	}
	public void setCardapio(Produtos cardapio) {
		this.produto = cardapio;
	} 
	
	
}
