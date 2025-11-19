package maratona.java;

public class DevJavaEstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("Dentro do-while "+contador);
            contador++;
        } while (contador < 10);
    }
}
