package br.com.flytran.entrega.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.mapping.List;



@SuppressWarnings("serial")
@Entity
@Table(name = "tab_Motorista")
public class Motorista extends Funcionario {

	@OneToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;

	@Column(name = "cnh_motorista")
	private String cnh;

	@OneToOne
	@JoinColumn(name = "v_placa")
	private Veiculo veiculo;

	@OneToMany(mappedBy = "motorista", targetEntity = Entregas.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List entregas;

	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List getEntregas() {
		return entregas;
	}

	public void setEntregas(List entregas) {
		this.entregas = entregas;
	}

	
	
}
