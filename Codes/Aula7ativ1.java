public class Aula7ativ1 {
	public static void main(String[] args) {
		ativ1("Bambu");
		ativ5("Tatu De Guachiva");
	}
	public static void ativ1(String nome) {
		char [] pedaco = nome.toCharArray();
		System.out.println(pedaco);
		for (int i = 0; i < pedaco.length; i++) {
			System.out.println(pedaco[i]);
		}
	}
	public static void ativ5(String nome) {
		char ponto = '.';
		int inicio = 0;
		int posicao = nome.indexOf(ponto);
		System.out.println("Existe p\n onto nas posições: ");
		while (inicio < nome.length() && posicao != -1) {
			System.out.println(posicao);
			inicio = posicao + 1;
			posicao = nome.indexOf(ponto, inicio);
		}
	}
}