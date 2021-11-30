package MemoriaArrayListas;

public class Aula92 {
    public static void main(String[] args) {
        /* Boxin -> É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.
        tradução"encaixotamento"
         */

        int x = 20;
        Object obj = x;

        System.out.println(obj);
        int y = (int) obj;
        System.out.println(y);

        /*Wrapper clasees
        São classes equivalente aos tipos primitivos.
        Boxing e unboxing é natural na linguagem.
        Uso ocomum: campos de entidades em sistemas de informação (importante!)
        Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO

         */

        int a = 20;
        Integer objeto = a;

        System.out.println(objeto);
        int b =  objeto * 2;
        System.out.println(b);
    }
}
