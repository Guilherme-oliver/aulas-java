package estruturaRepetitiva;

import java.util.Scanner;

public class aula55 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsios: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        char resp = sc.next().charAt(0);

        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsios: ");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }

        sc.close();
    }
}
