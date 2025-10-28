import java.util.Locale;
import java.util.Scanner;

public class rotacionar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palavra, criptografada;
        int deslocamento;
        System.out.println("palavra --> ");
        palavra=sc.next();
        System.out.println("deslocamento --> ");
        deslocamento=sc.nextInt();
        criptografada = rotacionar(palavra, deslocamento);
        System.out.println(criptografada);
    }
    public static String rotacionar(String palavra, int deslocamento){
        String cripto="";
        int aux;
        palavra=palavra.toLowerCase();
        for (int i=0; i<palavra.length(); i++){
            aux=palavra.charAt(i);
            aux+=deslocamento;
            cripto+=(char) aux;
        }

        return cripto;
    }

}
