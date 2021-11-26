import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface AnonClass {
    public void anonMethod();
}

public class Anonimo {
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

        AnonClass anon = new AnonClass() {
            public void anonMethod() {
                Collections.sort(nombres);
            }
        };

        anon.anonMethod();

        System.out.println("\nOrden alfabético con clase anónima: ");
        for (String elemento : nombres) {
            System.out.println(elemento);
        }
    }
}
