package unipe.br.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(sequenceName="categoria_seq", name="categoria_id", allocationSize=1)
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoria_id")
	private Long id;
	
	@Column(name="nome", length=50)
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
