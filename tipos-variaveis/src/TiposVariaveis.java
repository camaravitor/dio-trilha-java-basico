public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; 

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting: alterado o tipo de variável para um que corresponda melhor

        int numero = 5;
        numero = 10;

        System.out.print(numero); // exemplo que mostra que uma variável pode ser alterada de acordo com o valor declarado

        final double VALOR_DE_PI = 3.14; // exemplo que mostra que uma CONSTANTE (uso do final) não pode ter seu valor alterado

    }
}
