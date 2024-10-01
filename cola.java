import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class cola {

    static final int TOTAL_CARRITOS = 25;
    static int carritosDisponibles = TOTAL_CARRITOS;
    static Queue<Integer>[] cajas = new LinkedList[3]; // Array de cajas

    public static void main(String[] args) {
        Random random = new Random();

        // Inicializar las colas de las cajas
        for (int i = 0; i < cajas.length; i++) {
            cajas[i] = new LinkedList<>();
        }

        // Simular la llegada de 50 clientes
        for (int cliente = 1; cliente <= 50; cliente++) {
            System.out.println("Llega el cliente " + cliente);

            if (carritosDisponibles > 0) {
                carritosDisponibles--;
                System.out.println("Cliente " + cliente + " toma un carrito. Carritos disponibles: " + carritosDisponibles);

                formarseEnCaja(cliente);

                // Procesar pago cada 3 clientes
                if (cliente % 3 == 0) procesarPago();
            } else {
                System.out.println("Cliente " + cliente + " espera un carrito.");
                procesarPago(); 
                cliente--; // Intentar de nuevo
            }
            System.out.println();
        }
    }

    public static void formarseEnCaja(int cliente) {
        int cajaMenor = 0;

        for (int i = 1; i < cajas.length; i++) {
            if (cajas[i].size() < cajas[cajaMenor].size()) cajaMenor = i;
        }

        cajas[cajaMenor].add(cliente);
        System.out.println("Cliente " + cliente + " se forma en la caja " + (cajaMenor + 1) + ".");
    }

    public static void procesarPago() {
        for (Queue<Integer> caja : cajas) {
            if (!caja.isEmpty()) {
                int clienteAtendido = caja.poll();
                carritosDisponibles++;
                System.out.println("Cliente " + clienteAtendido + " ha pagado. Carritos disponibles: " + carritosDisponibles);
                break;
            }
        }
    }
}
