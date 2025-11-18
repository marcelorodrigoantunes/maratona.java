package maratona.java;

public class DevJavaElseIf05 {
    public static void main(String[] args) {

        /* outra opção
        
         int idade = 18;
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil";
        }
        else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
         */


        int idade = 18;

        if (idade < 15){
            System.out.println("Categoria infantil");
        }
        else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
    }
}
