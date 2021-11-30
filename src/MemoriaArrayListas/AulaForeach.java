package MemoriaArrayListas;

public class AulaForeach {
    public static void main(String[] args) {
        /*
        Laço " for each"
        Sintaxe opicional e simplificada para percorrer coleções
        Sintaxe:
        for(Tipo apelidoo : coleção){
        <comando 1>
        <comando 2>
        }
         */
        String[] vect = new String[]{"maria", "Bob", "Alex"};
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------");
        for (String obj : vect ){
            System.out.println(obj);

        }

    }
}
