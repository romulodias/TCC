package br.com.flytran.entrega.domain;

import org.primefaces.component.messages.Messages;

public class Cep {
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String unidade;
	private String ibge;
	private String gia;
	private Boolean erro;
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public Boolean getErro() {
		return erro;
	}
	public void setErro(Boolean erro) {
		this.erro = erro;
	}
	
	public void buscarCEP() {
		try {
			Client cliente = ClientBuilder.newClient();
			WebTarget caminho = cliente
					.target("http://viacep.com.br/ws/" + pessoa.getCep().replace(".", "").replace("-", "") + "/json/");
			String json = caminho.request().get(String.class);

			Gson gson = new Gson();
			CEP cep = gson.fromJson(json, CEP.class);

			if (cep.getErro() == null) {
				pessoa.setBairro(cep.getBairro());
				pessoa.setRua(cep.getLogradouro());
				pessoa.setUf(cep.getUf());
			} else {
				Messages.addGlobalError("CEP inválido");
			}
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar obter os dados do CEP");
			erro.printStackTrace();
		}
	}  

}
