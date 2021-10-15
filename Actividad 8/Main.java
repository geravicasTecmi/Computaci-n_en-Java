import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] palo = {"Pica", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }
        System.out.println("El tamaño del deck es: " + deck.getCard().size());
        System.out.println("Mezclar Deck\n" + deck.mezclar());

        //System.out.println("\nLista de cartas:"); //No hacer caso, solo para nuestras pruebas
        //deck.imprimir();

        System.out.println("\nPrimero en la lista:");
        deck.head();

        System.out.println("\nCarta al azar:");
        deck.pick();

        System.out.println("\nArreglo de cartas:");
        deck.hand();

        //System.out.println("\nLista de cartas parte 2:"); //No hacer caso, solo para nuestras pruebas
        //deck.imprimir();
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
