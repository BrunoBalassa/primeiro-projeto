package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;



    public double netSalary(){
        return grossSalary - tax ;
    }

    public void IncreaseSalary(double porcento)
    {
        grossSalary += grossSalary * porcento / 100;
    }


    public String toString() {
        return name + ", $ " + netSalary();
    }
}
