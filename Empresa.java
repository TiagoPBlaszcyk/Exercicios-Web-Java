public class Empresa{

	public static void main(String[] args) throws Exception{

		Carro sportpreto = new Carro("esportivo", "preto", "MHX 1234", 4);
		Pessoa nomeDono = new Pessoa("Camila", "(31)13 123-13-13", 27);
		Endereco localizacao = new Endereco("Ape", 123, "Sants", "Flauze", "Zenta" , "93.312.432-020");
	
		sportpreto.setDono(nomeDono);	
		nomeDono.setVeiculo(sportpreto);
		nomeDono.setEndereco(localizacao);
		
		System.out.println("Cor: " + sportpreto.getCor());
		System.out.println("Número de portas: " + sportpreto.getNumPortas());
		System.out.println("Placa: " + sportpreto.getPlaca());
		System.out.println("Tipo: " + sportpreto.getTipo());
		System.out.println("Proprietário (a): " + sportpreto.getDono().getNome());
		System.out.println("CEP : " + nomeDono.getEndereco().getCep());

		nomeDono.ligarVeiculo();
		nomeDono.setCambioVeiculo(1);
		nomeDono.acelerarVeiculo();
		nomeDono.setCambioVeiculo(2);
		nomeDono.acelerarVeiculo();
		nomeDono.setCambioVeiculo(3);
		nomeDono.acelerarVeiculo();
		nomeDono.setCambioVeiculo(2);
		nomeDono.acelerarVeiculo();
		nomeDono.setCambioVeiculo(1);
		nomeDono.acelerarVeiculo();
		nomeDono.setCambioVeiculo(0);
		nomeDono.frearVeiculo();
		nomeDono.desligarVeiculo();

	}
}
