package estruturaSequencial;

public class exercicio05 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        /código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

         */

        int codigo1 = 12;
        int numeroDePecas1 = 1;
        double valorDaPeca1 = 5.30;

        int codigo2 = 16;
        int numeroDePecas2 = 2;
        double valorDaPeca2 = 5.10;

        double valorAPagar = (valorDaPeca2 * 2) + valorDaPeca1;

        System.out.println("Entrada ");
        System.out.println("Código1: " + codigo1);
        System.out.println("Número de peças: " + numeroDePecas1);
        System.out.println("Valor unitário: " + valorDaPeca1);
        System.out.println();
        System.out.println("Código2: " + codigo2);
        System.out.println("Número de peças: " + numeroDePecas2);
        System.out.println("Valor unitário: " + valorDaPeca2);
        System.out.println();
        System.out.println("Saída: ");
        System.out.println("Valor a pagar: " + valorAPagar);

    }
}
