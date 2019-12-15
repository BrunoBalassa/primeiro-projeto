package entities;

public class Quartos {
    public String name;
    public String email;


    public Quartos(String name, String email) {
        this.name = name;
        this.email = email;

    }

    @Override
    public String toString() {
        return   name +", "+ email;
    }
}
