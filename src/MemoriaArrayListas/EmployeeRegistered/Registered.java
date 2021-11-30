package MemoriaArrayListas.EmployeeRegistered;

public class Registered {
    private String name;
    private int id;
    private double salary;

    public Registered(){
    }
    public Registered(Integer id, String name, double salary){
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.id = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public  double getSalary(){
        return  this.salary = salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary += salary * percentage/ 100;
    }
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }




}
