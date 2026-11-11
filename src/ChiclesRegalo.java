package src;

import java.util.Scanner;

public class ChiclesRegalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el número de envoltorios que  se necesitan, " + "los envoltorios que te dan, " + "y los" +
                " chicles que compras ");

        int eNecesarios = sc.nextInt();
        int chiclesRegalados = sc.nextInt();
        int chiclesComprados = sc.nextInt();

        while (eNecesarios != 0 || chiclesRegalados != 0 || chiclesComprados != 0) {
            if (chiclesRegalados >= eNecesarios) {
                System.out.println("RUINA");
            } else {
                int totalComidos = chiclesComprados;
                int envoltorios = chiclesComprados;

                while (envoltorios >= eNecesarios) {
                    int chiclesCanjeados = envoltorios / eNecesarios;
                    int chiclesObtenidos = chiclesCanjeados * chiclesRegalados;

                    totalComidos = totalComidos + chiclesObtenidos;

                    envoltorios = envoltorios % eNecesarios;
                    envoltorios = envoltorios + chiclesObtenidos;
                }
                System.out.println(totalComidos + " " + envoltorios);
            }
            eNecesarios = sc.nextInt();
            chiclesRegalados = sc.nextInt();
            chiclesComprados = sc.nextInt();
        }
    }
}


