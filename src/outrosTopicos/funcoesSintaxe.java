package outrosTopicos;

import java.util.Scanner;

public class funcoesSintaxe {
    public static void main(String[] args) {
     /*-Funções
     -Representam um processamento que possui um significado
     +Math.sqrt(double)
     +System.out.println(String)

     - Principais vatagens: modularização, delegação e reaproveitamento

     - Dados de entrada e saída
     + Funções podem receber dados de entrada(parâmentro ou argumentos)
     + Funções podem ou não retornar uma saída

     - Em orientação a objetos, funções em classes recebem o nome de "métodos"

      */

        double y = 25.0;
        double x = Math.sqrt(y);

        System.out.println(x);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        }
        else if (b > c) {
            System.out.println("Higher = " + b);
        }
        else {
            System.out.println("Higher = " + c);
        }
        sc.close();
    }
}

