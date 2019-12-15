package entities;

public class Deposito {
        private String name;
        private int cont;
        private double deposito;

    public Deposito(String name, int cont) {
        this.name = name;
        this.cont = cont;

    }

    public Deposito(String name, int cont, double initialDeposit) {
        this.name = name;
        this.cont = cont;
        deposit(initialDeposit);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCont() {
        return cont;
    }

    public double getDeposito() {
        return deposito;
    }

    public void deposit(double amount){
        deposito += amount;
    }
    public void withdrow(double amount){
        deposito -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account " + cont + ", Holder: " + name + ", Balance $ " + String.format("%.2f", deposito);
    }
}
