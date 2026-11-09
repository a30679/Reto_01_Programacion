package src;

import java.util.Scanner;
public class SumaDescendente{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero <= 1000000000 && numero >= 1){
            while (numero != 0) {
                int divisor = 1;
                long suma = 0;

                while (numero / divisor >= 10) {
                    divisor = divisor * 10;
                }

                while (numero != 0) {
                    suma = suma + numero;
                    numero = numero % divisor;
                    divisor = divisor / 10;
                }
                System.out.println(suma);
                numero = sc.nextInt();
            }
        }else

            System.out.println("Proceso finalizado");

    }

}