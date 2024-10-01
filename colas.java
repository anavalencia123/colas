import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class colas {

    public static void main(String[] args) {
        Queue<Integer> colaOriginal = new ArrayDeque<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = random.nextInt(51) - 25; 
            colaOriginal.add(numeroAleatorio);
        }

        System.out.println("Cola original: " + colaOriginal);

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea formar una cola con solo los números negativos? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            Queue<Integer> colaNegativos = new ArrayDeque<>();

            for (Integer numero : colaOriginal) {
                if (numero < 0) {
                    colaNegativos.add(numero);
                }
            }
                System.out.println("Cola de números negativos: " + colaNegativos);
            }
                else {
            System.out.println("No se ha formado ninguna cola nueva.");
        }
    }
}
