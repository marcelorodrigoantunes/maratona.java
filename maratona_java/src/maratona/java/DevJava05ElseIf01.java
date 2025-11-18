package maratona.java;

public class DevJava05ElseIf01 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Não doar";

        //operador ternario
        //String resultado = salario > 500 ? mensagemDoar : mensagemNaoDoar;
        //System.out.println(resultado);

        String resultado;
        if (salario > 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
