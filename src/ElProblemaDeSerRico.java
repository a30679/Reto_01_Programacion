import java.util.Scanner;

public class ElProblemaDeSerRico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos;
        int compartimentos;
        int capacidad;
        int diferencia;

        do {
            System.out.println("Dame el número de casos que quieres probar");
            casos = sc.nextInt();
        } while (casos < 0);

        for (int i = 0; i < casos; i++) {
            do {
                System.out.println("Dame el número de compartimentos, la capacidad en litros del más grande y la diferencia " +
                        "de litros entre dos compartimentos adyacentes. Separa los datos con un espacio");
                compartimentos = sc.nextInt();
                capacidad = sc.nextInt();
                diferencia = sc.nextInt();

            } while (
                    compartimentos <= 0 || compartimentos > 10000 ||
                    capacidad <= 0 || capacidad > 10000 ||
                    diferencia < 0 || diferencia > 10000
            );


            int total = 0;

            for (int j = 0; j < compartimentos; j++) {

                total = total + capacidad;

                capacidad = capacidad - diferencia;
            }

            System.out.println(total);
        }


    }
}
