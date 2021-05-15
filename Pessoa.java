public class Pessoa { 
	public String nome; 
	public String telefone; 
	public int idade;
	public Endereco residencia;
	
	Carro veiculo;

    public Pessoa(String nome, String telefone, int idade) {
        this.nome = nome;
		this.telefone = telefone;
        this.idade = idade;
    }

    Endereco getEndereco() {
        return residencia;
    }

    void setEndereco(Endereco endereco) {
        this.residencia = endereco;
    }

    Carro getVeiculo(){
        return veiculo;
    }

    void setVeiculo(Carro carro){
        this.veiculo = carro;
    }

	void ligarVeiculo(){
        veiculo.ligar();
    }

    void desligarVeiculo(){
        veiculo.desligar();
    }

    void acelerarVeiculo(){
        veiculo.acelerar();
    }

    void frearVeiculo(){
        veiculo.frear();
    }

    void setCambioVeiculo(int marcha){
        veiculo.setCambio(marcha);
    }

	void setNome (String dono) {
		this.nome = dono;
	}
	
	String getNome(){
		return nome;
	}

	void setIdade (int idade) {
		this.idade = idade;
	}

	int getIdade(){
		return idade;
	}

    void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	String getTelefone(){
		return telefone;
	}
}



