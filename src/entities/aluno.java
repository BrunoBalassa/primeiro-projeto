package entities;

public class aluno {
    public  String nome;
    public double nota1,nota2,nota3;

    public double Notafinal(){
        return nota1 + nota2 + nota3;
    }
    public double MissingPoints(){
        if (Notafinal() < 60.0){
            return 60.0 - Notafinal();
        }
        else
            return 0;
    }



}
