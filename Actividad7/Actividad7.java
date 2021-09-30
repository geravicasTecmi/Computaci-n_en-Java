import java.util.Scanner;
public class Actividad7 {
    public static void main (String[] args) {
        //Declaración de variables básicas
        Scanner scanner = new Scanner(System.in);
        boolean esPrimo;
        int contador = 0;
        int cantidadA, cantidadB, fibo1=0, fibo2=1;
        int tam=0;

        //Obtención de datos
        System.out.print("Introduce la cantidad de números para buscar números primos: ");
        cantidadA = scanner.nextInt();

        System.out.print("Introduce la cantidad de números para Sucesión de Fibonacci: ");
        cantidadB = scanner.nextInt();
        scanner.close();

        //Números primos
        int[] numero = new int[cantidadB];
        for (int n = 2; contador < cantidadA; n ++) {
            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n) && esPrimo; i ++) {
                if ((n % i) == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                numero[contador] = n;
                contador ++;
            }
        }

        //Sucesión de Fibonacci
        int[] fibbo =new int[cantidadB];
        for (int z=2; z<=cantidadB; z++){
            fibbo[z-2]=fibo1;
            fibbo[z-1]=fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }

        //Imprime matriz Números primos
        System.out.println("Lista de números primos:");
        for (int i=0; i<cantidadB; i++) {
            System.out.print(numero[i]+", ");
        }

        System.out.print("\n");

        //Imprime matriz Sucesión
        System.out.println("Lista de Sucesión de Fibonacci:");
        for (int i=0; i<cantidadB; i++) {
            System.out.print(fibbo[i]+", ");
        }
    }
}