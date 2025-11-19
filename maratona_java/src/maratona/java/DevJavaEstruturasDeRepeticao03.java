package maratona.java;

public class DevJavaEstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 49;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(++valorMax);
        }
    }
}
