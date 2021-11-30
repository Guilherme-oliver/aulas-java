package estruturaSequencial;

import java.util.Scanner;

public class exercicio_if_02 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
