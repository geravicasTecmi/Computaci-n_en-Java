import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] palo = {"Pica", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        int opcion;
        boolean exit=true;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }

        do {
            try {
                opcion = showMenu(deck);

                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Mezclar Deck\n" + deck.mezclar());
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            exit=false;
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("\nObtener la primer carta en la lista:");
                            deck.head();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            exit=false;
                        }
                        break;

                    case 3:
                        try {
                            System.out.println("\nCarta al azar:");
                            deck.pick();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            exit=false;
                        }
                        break;

                    case 4:
                        try {
                            System.out.println("\nArreglo de cartas:");
                            deck.hand();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                            exit=false;
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        exit=false;
                        break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (exit);
    }

    public static int showMenu(Deck deck) throws Exception{
        Scanner texto = new Scanner(System.in);
        int eleccion;

        System.out.println("\n¡Bienvenido a Poker!");
        System.out.println("La cantidad de cartas en el deck es de: " + deck.getCard().size()+"\n");

        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck.");
        System.out.println("2 Sacar una carta.");
        System.out.println("3 Elegir una carta al azar");
        System.out.println("4 Genera una mano de 5 cartas");
        System.out.println("0 Salir");
        eleccion = texto.nextInt();

        if ((eleccion<0)||(eleccion>4)){
            throw new Exception("Opción no válida. Ingresa un número del 1 al 4.");
        }
        return eleccion;
    }

    public static String getColor(String palo) {
        if (palo.toLowerCase().equals("pica") || palo.toLowerCase().equals("trebol")) {
            return "negro";
        }
        if (palo.toLowerCase().equals("corazon") || palo.toLowerCase().equals("diamante")) {
            return "rojo";
        }
        return null;
    }
}
