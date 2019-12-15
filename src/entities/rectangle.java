package entities;

public class rectangle {
    public double width, height;



    public double area(){
        return width * height;
    }

    public double perimetro(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        return Math.sqrt(width * width + (height * height));
    }


    public String toString() {
        return "Area = " + area() + " Perimeter = " + perimetro() + " diagonal = " + diagonal();
    }
}
