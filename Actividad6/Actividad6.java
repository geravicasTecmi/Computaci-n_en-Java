class promedio{
    public String nombre;
    public int[] calific;

    public promedio(String nombre, int[] calific) {
        this.nombre = nombre;
        this.calific = calific;
    }

    public int prom(){
        int suma=0;
        int division;
        for(int i=0; i<5; i++){
            suma+=calific[i];
        }
        division=suma/5;
        return division;
    }

    public char nota(int tot){
        char letra;
        if(tot<=50) letra='F';
        else if((tot>50)&&(tot<=60)) letra='E';
        else if((tot>60)&&(tot<=70)) letra='D';
        else if((tot>70)&&(tot<=80)) letra='C';
        else if((tot>80)&&(tot<=90)) letra='B';
        else letra='A';

        return letra;
    }

    public void terminar(double prom, char nota){
        System.out.println("Nombre: "+nombre);
        System.out.println("Calificación 1: "+calific[0]);
        System.out.println("Calificación 2: "+calific[1]);
        System.out.println("Calificación 3: "+calific[2]);
        System.out.println("Calificación 4: "+calific[3]);
        System.out.println("Calificación 5: "+calific[4]);
        System.out.println("Promedio: "+prom);
        System.out.println("Calificación: "+nota);
    }
}

public class Actividad6 {
    public static void main(String[] args) {
        int[] calificaciones = new int[]{50, 47, 80, 100, 99};

        promedio alumno1 = new promedio("José", calificaciones);

        int datosA = alumno1.prom();
        char datosB = alumno1.nota(datosA);

        alumno1.terminar(datosA,datosB);
    }
}