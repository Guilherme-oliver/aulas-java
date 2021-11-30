package estruturaSequencial;

public class exercicio04 {
    public static void main(String[] args) {
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
         */

        int numeroFuncionario = 25;
        int horasTrabalhadas = 100;
        double valorHoraTrabalhada = 5.50;
        double salario = valorHoraTrabalhada * horasTrabalhadas;

        System.out.println("Entrada");
        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da hora trabalhada: " + valorHoraTrabalhada);
        System.out.println();
        System.out.println("Saída ");
        System.out.println("Number: " + numeroFuncionario);
        System.out.printf("%.2f U$ Salary %n ", salario );

    }
}
