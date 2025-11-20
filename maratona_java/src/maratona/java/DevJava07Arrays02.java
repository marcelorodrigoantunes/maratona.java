package maratona.java;

public class DevJava07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Marcelo";
        nomes[1] = "Rodrigo";
        nomes[2] = "Antunes";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
