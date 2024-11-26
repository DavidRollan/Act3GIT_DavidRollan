package numeros;

import java.util.Scanner;

public class Sieteen7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        // Solicitar dos números distintos
        do {
            System.out.print("Introduce el primer número entero: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número entero (distinto del primero): ");
            num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Los números no pueden ser iguales. Inténtalo de nuevo.");
            }
        } while (num1 == num2);

        // Determinar el menor y el mayor
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Imprimir los números incrementando de 7 en 7
        System.out.println("Los números comprendidos entre " + menor + " y " + mayor + " incrementando de 7 en 7 son:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
