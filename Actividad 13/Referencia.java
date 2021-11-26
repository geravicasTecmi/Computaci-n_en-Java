import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Order {
    List <String> ordenamiento (List nombres);
}

class Acomodo {
    static List <String> ord(List nombres){
        Collections.sort(nombres);
        return nombres;
    }
}

public class Referencia {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Angel");
        nombres.add("Ernesto");
        nombres.add("Gerardo");
        nombres.add("Luna");
        nombres.add("Amity");
        nombres.add("Luz");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Sebastian");
        nombres.add("Juan");

        Order clasificar = Acomodo::ord;

        clasificar.ordenamiento(nombres);
        System.out.println("\nOrden alfabético con método de referencia: ");
        for (String elemento : nombres) {
            System.out.println(elemento);

        }
    }
}
