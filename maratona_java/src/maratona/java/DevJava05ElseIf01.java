package maratona.java;

public class DevJava05ElseIf01 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Não doar";
        String resultado;
        if (salario > 500){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
