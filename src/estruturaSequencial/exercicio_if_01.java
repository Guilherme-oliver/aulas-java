package estruturaSequencial;

import java.util.Scanner;

public class exercicio_if_01 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("Negativo ");
        }
        else {
            System.out.println("Não é negativo");
        }

    }
}
