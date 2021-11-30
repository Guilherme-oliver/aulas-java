package estruturaSequencial;

public class exercicio01 {
    public static void main(String[] args) {
        /*Exercício 01
        /Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
        /Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        /mensagem explicativa, conforme exemplos.
        Exemplos:
        Entrada: 10  30 Saída: Soma = 40
        Entrada: -30  10 Saída: Soma = -20
        Entrada:0  0 Saída: Sooma = 0

         */
        int valor1 = 10;
        int valor2 = 30;
        int Soma = valor1 + valor2;

        System.out.println("Entrada ");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println("Saida ");
        System.out.println("Soma = " + Soma);
    }
}
