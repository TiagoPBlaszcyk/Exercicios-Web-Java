public class DesafioPalavrasAoVento {

    public static void main(String[] args) {

        // Classe Auxiliar gera palavras aleatorias atravez do tazmania() e numeros de
        // 0 a 100 atravez da nazare()

        // Numb e text serao meus arrays que estao fora de ordem
        int quantidade = 10;
        int[] numb = Auxiliar.nazare(quantidade);
        String[] text = Auxiliar.tazmania(quantidade);

        System.out.println("\n");
        // Imprime os vetor de numeros
        Auxiliar.imprimirnumeros(numb);

        // Imprime os vetor strings
        Auxiliar.imprimirpalavras(text);

        // Organiza o vetor numb em numeros

        System.out.println("\nOrganizando...");

        int auxnumb;

        for (int i = 0; i < quantidade; i++) {

            for (int j = i; j < quantidade; j++) {

                if (numb[i] > numb[j]) {
                    auxnumb = numb[i];
                    numb[i] = numb[j];
                    numb[j] = auxnumb;
                }

            }

        }

        // https://www.javatpoint.com/java-string-charat#:~:text=The%20java%20string%20charAt(),length%20or%20a%20negative%20number.

        String auxtext = "";
        for (int i = 0; i < quantidade; i++) {

            for (int j = i; j < quantidade; j++) {

                if (text[j].charAt(0) < text[i].charAt(0)) {
                    auxtext = text[i];
                    text[i] = text[j];
                    text[j] = auxtext;

                } else if (text[j].charAt(0) == text[i].charAt(0)) {

                    if (text[j].charAt(1) > text[i].charAt(1)) {
                        auxtext = text[i];
                        text[i] = text[j];
                        text[j] = auxtext;
                    }

                } 

            }

        }

        System.out.println("Organizado!\n");

        Auxiliar.imprimirnumeros(numb);
        Auxiliar.imprimirpalavras(text);
    }

}