import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle implements Shape{
    private double lado;
    private double altura;

    public Triangle(double lado){
        this.lado=lado;
        this.altura=calcAltura();
    }

    public double calcAltura(){
        return sqrt(pow(lado,2)-pow(lado/2.0,2));
    }

    public double getLado(){
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return (lado*altura)/2.0;
    }

    public double getPerimeter() {
        return lado*3;
    }
}
