package estruturaSequencial;

public class exercicio03 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        /de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */

        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;
        int Diferenca = (A * B) - (C * D);
        System.out.println("Entrada ");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println("Saida ");
        System.out.println("Diferença = " + Diferenca);

    }
}
