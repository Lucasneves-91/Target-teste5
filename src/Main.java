import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String palavra = leitura.nextLine();

        StringBuilder inverso = new StringBuilder();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverso.append(palavra.charAt(i));
        }

        System.out.println(inverso);
    }
}
