package MemoriaArrayListas;

import MemoriaArrayListas.Produtos.Aluguel;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Aula91 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluguel[] vetor = new Aluguel[10];

        System.out.print("Quantos quartos serão alocados: ");
        int n = sc.nextInt();

        for (int i = 1; i < vetor.length; i ++){
            System.out.println();
            System.out.println("Quarto alugado #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Aluguel(nome, email);
        }
        System.out.println();
        System.out.println("Quarto ocupado: ");
        for (int i = 0; i < 10; i++){
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }


        sc.close();
    }
}
