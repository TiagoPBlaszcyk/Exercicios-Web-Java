public class Pratica1Endereco { 
	public String rua; 
	public int numero; 
	public String bairro; 
	public String cidade; 
	public String estado; 
	public String cep; 

	public Pratica1Endereco(String rua, int numero, String bairro, String cidade, String estado, String cep) {
		this.rua = rua;
		this.numero = numero;
        this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	void setRua (String rua) {
		this.rua = rua;
	}
	
	int getNumero(){
		return numero;
	}

	void setNumero (int numero) {
		this.numero = numero;
	}
	
	String getRua(){
		return rua;
	}

	void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	String getCidade(){
		return cidade;
	}
	void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	String getEstado(){
		return estado;
	}
	void setEstado (String estado) {
		this.estado = estado;
	}
	String getCep(){
		return cep;
	}
	void setCep (String cep) {
		this.cep = cep;
	}
	
}
