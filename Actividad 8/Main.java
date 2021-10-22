import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        String[] palo = {"Pica", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        int opcion;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }

        do{
            opcion=showMenu(deck);

            switch (opcion){
                case 1:
                    System.out.println("Mezclar Deck\n" + deck.mezclar());
                    break;

                case 2:
                    System.out.println("\nObtener la primer carta en la lista:");
                    deck.head();
                    break;

                case 3:
                    System.out.println("\nCarta al azar:");
                    deck.pick();
                    break;

                case 4:
                    System.out.println("\nArreglo de cartas:");
                    deck.hand();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while(opcion !=0);
    }

    public static int showMenu(Deck deck){
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