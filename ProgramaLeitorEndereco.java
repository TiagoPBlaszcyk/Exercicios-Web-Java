import java.util.Scanner;

public class ProgramaLeitorEndereco { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("-- Digite seu primeiro endereço --"); 
		EnderecoLeitor end1 = lerEndereco(leitor); 
		System.out.println("-- Digite seu segundo endereço --"); 
		EnderecoLeitor end2 = lerEndereco(leitor); 
		System.out.println("------ Seu primeiro endereço é -----"); 
		imprimirEndereco(end1); 
		System.out.println("------ Seu segundo endereço é -----");
		imprimirEndereco(end2); 
	}

	public static EnderecoLeitor lerEndereco(Scanner leitor) { 
		EnderecoLeitor end = new EnderecoLeitor(); 
		System.out.println("Digite a rua onde você mora:"); 
		end.rua = leitor.nextLine(); 
		System.out.println("Digite o número da residência:"); 
		end.numero = leitor.nextInt(); 
		leitor.nextLine();
		System.out.println("Digite o bairro:"); 
		end.bairro = leitor.nextLine(); 
		System.out.println("Digite a cidade:"); 
		end.cidade = leitor.nextLine(); 
		System.out.println("Digite o estado:"); 
		end.estado = leitor.nextLine(); 
		System.out.println("Digite o CEP:"); 
		end.cep = leitor.nextLine();
		return end; 
	}
	public static void imprimirEndereco(EnderecoLeitor end) { 
		System.out.println(end.rua + ", " + end.numero); 
		System.out.println(end.bairro + ", " + end.cidade); 
		System.out.println("CEP " + end.cep + ", " + end.estado); 
	} 
}