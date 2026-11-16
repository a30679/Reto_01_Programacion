package src;

import java.util.Scanner;

public class SumaDescendente_ConFunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame números para calcular su suma descendente. Finaliza cuando escribas 0");
        int numero = sc.nextInt();

        if (numero <= 1000000000 && numero >= 1) {
            while (numero != 0) {
                int divisor = calcularDivisor(numero);
                long suma = calcularSumaDescendente(numero, divisor);

                System.out.println(suma);
                numero = sc.nextInt();
            }
        } else {
            System.out.println("Proceso finalizado");
        }
    }

    public static int calcularDivisor (int numero){
        int divisor = 1;

        while (numero / divisor >= 10){
            divisor = divisor * 10;
        }
        return divisor;
    }
    public static long calcularSumaDescendente(int numero, int divisor){
        long suma = 0;

        while (numero != 0){
            suma = suma + numero;
            numero = numero % divisor;
            divisor = divisor / 10;
        }
        return suma;
    }
}

