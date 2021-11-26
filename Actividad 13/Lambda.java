import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Ordenar {
    List <String> ordenamiento (List nombres);
}

public class Lambda {
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

        Ordenar alf = (nombres1) -> {
            Collections.sort(nombres1);
            return nombres1;
        };

        alf.ordenamiento(nombres);
        System.out.println("\nOrden alfabético con lambda: ");
        for (String elemento : nombres) {
            System.out.println(elemento);

        }
    }
}
