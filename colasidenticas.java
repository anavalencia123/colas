import java.util.Queue;
import java.util.ArrayDeque;

public class colasidenticas {
    public static void main(String[] args) {
        Queue<String> num1 = new ArrayDeque<>();
        Queue<String> num2 = new ArrayDeque<>();

        num1.add("1");
        num1.add("1");
        num1.add("2");

        num2.add("1");
        num2.add("1");
        num2.add("2");

        System.out.println("Cola 1: " + num1);
        System.out.println("Cola 2: " + num2);

        if (sonIdenticos(num1,  num2)) {
            System.out.println("Las colas son idénticas.");
        } else {
            System.out.println("Las colas NO son idénticas.");
        }
    }

    public static boolean sonIdenticos(Queue<String> cola1, Queue<String> cola2) {
        if (cola1.size() != cola2.size()) return false;
        return cola1.equals(cola2);
    }
}
