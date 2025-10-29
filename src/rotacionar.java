import java.util.Locale;
import java.util.Scanner;

public class rotacionar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra, criptografada;
        int deslocamento;
        System.out.println("palavra --> ");
        palavra = sc.next();
        System.out.println("deslocamento --> ");
        deslocamento = sc.nextInt();
        criptografada = rotacionar(palavra, deslocamento);
        System.out.println(criptografada);
    }

    public static String rotacionar(String palavra, int deslocamento) {
        String cripto = "";
        int aux;
        char ch;
        int desloc = ((deslocamento % 26)+26)%26;
        for (int i = 0; i < palavra.length(); i++) {
            ch = palavra.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                aux = ch - 'a';
                cripto += (char) ('a' + (aux + desloc) % 26);
            }
            if (ch >= 'A' && ch <= 'Z') {
                aux = ch - 'A';
                cripto += (char) ('A' + (aux + desloc) % 26);
            }


        }
        return cripto;
    }
}

