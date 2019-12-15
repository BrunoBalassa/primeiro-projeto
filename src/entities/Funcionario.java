package entities;

public class Funcionario {
    public Integer id;
    public String name;
    public double salary;

    public Funcionario(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void Increase(double porcente){
        salary += salary * porcente / 100;

    }
}
