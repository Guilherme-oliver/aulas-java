package MemoriaArrayListas;

import java.util.Scanner;

public class Aula100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas linhas a matriz vai possuir: ");
        int n = sc.nextInt();
        System.out.println("Digite quantas colunas a matriz vai possuir:");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um numero que pertence a matriz: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0 ; j < mat[i].length; j++){
                if (mat[i][j] == x){
                    System.out.println(mat[i][i]);
                    count++;
                }
            }
        }
        System.out.println("Position count: " + count);


        sc.close();
    }
}
