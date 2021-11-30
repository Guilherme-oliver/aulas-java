package estruturaSequencial;

public class exercicio06 {
    public static void main(String[] args) {
       /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        float A = 3.0f;
        float B = 4.0f;
        float C = 5.2f;
        float pi = 3.14f;

        System.out.println("Área do triângulo retângulo: " + ((A * C)/2));
        System.out.println("Área do circulo: " + ((C * C) * pi));
        System.out.println("Área do trapézio: " + ((B + A) * C) / 2 );
        System.out.println("Áre do quadrado: " + (B*B) );
        System.out.println("Área do retangulo: " + (A * B));


    }
}
