package br.com.flytran.entrega.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="tab_usuario")
public class Funcionario extends Usuario {
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Usuario usuario;
 
	@Column(name="cpf_funcionario")
	private String cpf;
	@Column(name="cargo_funcionario") 
	private String cargo;
	@Column(name="nasc_usuario") 
	private int td_nasc;
	@Column(name="sexo_usuario") 
	private String sexo;


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

	public int getTd_nasc() {
		return td_nasc;
	}

	public void setTd_nasc(int td_nasc) {
		this.td_nasc = td_nasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
 
