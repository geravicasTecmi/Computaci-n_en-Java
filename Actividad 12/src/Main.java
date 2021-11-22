import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcion;
        Scanner scanner = new Scanner(System.in);

        AdressBook libro = new AdressBook();
        libro.load();

        do{
            opcion=menu();
            String entradaA=null, entradaB=null;

            switch (opcion){
                case 1:
                    System.out.println("Cargando contactos...");
                    libro.list();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Ingresa los datos del contacto:");
                    System.out.print("Número: ");
                    entradaA = scanner.nextLine();
                    System.out.print("Nombre: ");
                    entradaB = scanner.nextLine();
                    libro.create(entradaA,entradaB);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Ingresa el número telefónico del contacto que deseas eliminar:");
                    entradaA = scanner.nextLine();
                    try {
                        libro.delete(entradaA);
                    } catch (Exception e){
                        System.out.println(e.getMessage() +"\n");
                    }
                    break;

                case 4:
                    System.out.println("Guardando agenda y saliendo...");
                    break;

                default:
                    System.out.println("Entrada no válida. Intente de nuevo.\n");
                    break;
            }
        } while (opcion!=4);

        libro.save();
    }

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Mostrar contactos de la agenda.");
        System.out.println("2. Crear nuevo contacto.");
        System.out.println("3. Eliminar un contacto.");
        System.out.println("4. Salir.");
        eleccion=scanner.nextInt();

        return eleccion;
    }
}
