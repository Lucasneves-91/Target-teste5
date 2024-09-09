public class Main {
    public static void main(String[] args) {

        String original = "Oi pessoal!";
        StringBuilder inverso = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            inverso.append(original.charAt(i));
        }

        System.out.println(inverso);
    }
}
