class Desafio1Auxiliar {

    public static int random (int quantidade) {
        int random = (int)(Math.random() * quantidade ) + 1;
        return random;
    }

    
    public static int[] nazare (int quantidade) {
        int [] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random(100); 
        }

        return numeros;
    }


    public static String[] tazmania (int quantidade) {
        // Character.toString();
        String [] vogais = new String [5];
        String [] palavras = new String[quantidade];
        String [] alfabeto = new String[26];
        alfabeto[0] = "A"; 
        alfabeto[1] = "B";
        alfabeto[2] = "C";
        alfabeto[3] = "D";
        alfabeto[4] = "E";
        alfabeto[5] = "F";
        alfabeto[6] = "G";
        alfabeto[7] = "H";
        alfabeto[8] = "I";
        alfabeto[9] = "J";
        alfabeto[10] = "K";
        alfabeto[11] = "L";
        alfabeto[12] = "M";
        alfabeto[13] = "N";
        alfabeto[14] = "O";
        alfabeto[15] = "P";
        alfabeto[16] = "Q";
        alfabeto[17] = "R";
        alfabeto[18] = "S";
        alfabeto[19] = "T";
        alfabeto[20] = "U";
        alfabeto[21] = "V";
        alfabeto[22] = "W";
        alfabeto[23] = "X";
        alfabeto[24] = "Y";
        alfabeto[25] = "Z";

        vogais[0] = "A";
        vogais[1] = "E";
        vogais[2] = "I";
        vogais[3] = "O";
        vogais[4] = "U";
     
       for (int i = 0; i < palavras.length; i++) {
           palavras[i] = alfabeto[random(25)] + vogais[random(4)] + alfabeto[random(25)] + vogais[random(4)] + alfabeto[random(25)];
       } 

       return palavras;

    }

    public static void imprimirnumeros(int[] numb) {
        System.out.print("Vetor de Números aleatórios : ( ");
        for (int a = 0; a < numb.length; a++) {
            if (a < numb.length - 1) {
                System.out.print(numb[a] + ", ");
            } else {
                System.out.print(numb[a] + " ). \n");
            }

        }

    }

    public static void imprimirpalavras(String[] text) {
        System.out.print("Vetor de textos aleatórios : ( ");
        for (int a = 0; a < text.length; a++) {
            if (a < text.length - 1) {
                System.out.print(text[a] + ", ");
            } else {
                System.out.print(text[a] + " ). \n");
            }
        }
    }

}