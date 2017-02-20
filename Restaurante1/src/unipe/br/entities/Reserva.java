package unipe.br.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(sequenceName="reserva_seq", name="reserva_id", allocationSize=1)
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="reserva_id")
	private Long id;
	
	@Column(name="responsavel", length = 50)
	private String nome_responsavel;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicial, dataFinal;
	
	@Column
	private Integer num_pessoas;
	
	@ManyToOne
	private Funcionario funcionario;
			
	@ManyToOne
	private Mesa mesa;
	
	public Reserva (){
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Integer getNum_pessoas() {
		return num_pessoas;
	}
	public void setNum_pessoas(Integer num_pessoas) {
		this.num_pessoas = num_pessoas;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
}
