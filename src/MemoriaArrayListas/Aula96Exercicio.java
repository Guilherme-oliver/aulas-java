package MemoriaArrayListas;

import MemoriaArrayListas.EmployeeRegistered.Registered;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.sun.tools.attach.VirtualMachine.list;

public class Aula96Exercicio {
    public static void main(String[] args) {

        List<Registered> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employess will be resistered? ");
        int numberResistered = sc.nextInt();

        for (int i = 0; i < numberResistered; i++){
            System.out.println("Employee #" + (i + 1) +":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: " + sc.nextLine());
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Registered registered = new Registered(id, name, salary);
            list.add(registered);

        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Registered registered: list){
            System.out.println(registered);
        }

        sc.close();

    }

    public static Integer position(List<Registered> list, int id){
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
/* How many employees will be resgistered?

(necessario digitar nome, id e salario)

Employee #1:
Id: 333
Name: Maria Brwon
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase: 536
Enter the percentage: 10.0

(Enter the employee id that will have salary increase: 776
This id does not exist!)


List of employess:
333, Marua Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

(List of employess:
333, Marua Brown, 4000.00
536, Alex Grey, 3300.00)

 */
