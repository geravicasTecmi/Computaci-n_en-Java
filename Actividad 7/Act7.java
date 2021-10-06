import java.util.Scanner; //Importación de la herramienta para leer teclado.
class Series{ //Creación de la clase donde se realizan los cálculos
    public int tam; //Creación del atributo del tamaño de las sucesiones

    //Constructor
    public Series(int tam){
        this.tam= tam;
    }

    //Método para obtener números primos
    public void Primos(){
        boolean esPrimo;
        int contador = 0;

        //Generación de números primos
        int[] numero = new int[tam];
        for (int n = 2; contador < tam; n ++) {
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

        //Impresión de números primos
        System.out.println("Lista de números primos:");
        for (int i=0; i<tam; i++) {
            System.out.print(numero[i]+", ");
        }
    }

    //Método para Sucesión de Fibonacci
    public void Fibbonaci(){
        int fibo1=0, fibo2=1;

        //Sucesión de Fibonacci
        int[] fibbon =new int[tam];
        for (int z=2; z<=tam; z++){
            fibbon[z-2]=fibo1;
            fibbon[z-1]=fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.print("\n");
        //Imprime matriz Sucesión
        System.out.println("Lista de Sucesión de Fibonacci:");
        for (int i=0; i<tam; i++) {
            System.out.print(fibbon[i]+", ");
        }
    }
}

//Clase donde está el método principal
public class Act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamano=10;

        //Obtención de datos
        System.out.print("Ingresa el tamaño de los arreglos: ");
        tamano = scanner.nextInt();
        scanner.close();

        Series a= new Series(tamano);

        a.Primos();
        a.Fibbonaci();
    }
}
