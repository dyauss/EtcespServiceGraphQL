package br.com.etcesp.util;

public class ClienteInput {
    private String nome;
    private String cpfCnpj;
    private String dataNascimento;
    private String tipoLogradouro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String telefone;
    
	public ClienteInput(String nome, String cpfCpnj, String dataNascimento, String tipoLogradouro, String logradouro,
			String numero, String complemento, String cidade, String estado, String cep, String email,
			String telefone) {
		super();
		this.nome = nome;
		this.cpfCnpj = cpfCpnj;
		this.dataNascimento = dataNascimento;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
		this.telefone = telefone;
	}

	public ClienteInput() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCpnj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

    
}

