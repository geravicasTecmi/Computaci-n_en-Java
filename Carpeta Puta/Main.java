import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleccion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Selecciona una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo equilátero");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir del programa");
            eleccion=scanner.nextInt();

            switch (eleccion){
                case 1:
                    System.out.println("Ingresa radio");
                    Circle circle = new Circle(scanner.nextDouble());
                    System.out.println("El área es " +circle.getArea());
                    System.out.println("El perímetro es " +circle.getPerimeter() +"\n");
                    break;

                case 2:
                    System.out.println("Ingresa el lado");
                    Triangle triangle = new Triangle(scanner.nextDouble());
                    System.out.println("El área es " +triangle.getArea());
                    System.out.println("El perímetro es "+triangle.getPerimeter() +"\n");
                    break;

                case 3:
                    System.out.println("Ingresa el lado");
                    Square square = new Square(scanner.nextDouble());
                    System.out.println("El área es " +square.getArea());
                    System.out.println("El perímetro es " +square.getPerimeter() +"\n");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error. Opción no válida" +"\n");
                    break;
            }
        } while(eleccion!=4);
    }
}
