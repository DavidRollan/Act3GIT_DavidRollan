package numeros;

import java.util.Random;

public class numeros20 {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        Random random = new Random();
        
        System.out.println("20 números aleatorios entre 1 y 10:");
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10
            System.out.println(numeroAleatorio);
        }
    }
}
