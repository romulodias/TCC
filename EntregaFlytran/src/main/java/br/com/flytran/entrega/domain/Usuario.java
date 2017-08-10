package br.com.flytran.entrega.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tab_usuario")
public class Usuario extends GenericDomain{
 
	@Column(name="email_usuario")
	private String email;
	@Column(name="nome_usuario") 
	private String nome;
	@Column(name="senha_usuario") 
	private String senha;
	@Column(name="telefone_usuario") 
	private int telefone;
	@Column(name="cep_usuario") 
	private int cep;
	@Column(name="log_usuario") 
	private String logradouro;
	@Column(name="rua_usuario") 
	private String rua;
	@Column(name="num_usuario") 
	private int numero;
	@Column(name="comp_usuario") 
	private String complemento;
	
	public Usuario() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	 
	
	
	
	
	
}
 
