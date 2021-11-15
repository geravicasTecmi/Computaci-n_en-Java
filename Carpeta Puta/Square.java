import static java.lang.Math.pow;

public class Square implements Shape{
    private double lado;

    public Square(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() {
        return pow(lado,2);
    }

    @Override
    public double getPerimeter() {
        return lado*4;
    }
}
