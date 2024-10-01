import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> personas = new ArrayDeque<>();

        System.out.println(personas.isEmpty()); 

        personas.add("Pipe");
        personas.add("Peter");
        personas.add("Checho");

        System.out.println(personas); 

        System.out.println(personas.peek());
        System.out.println(personas.isEmpty()); 
        while (!personas.isEmpty()) {
            System.out.println(personas.poll());
        }
    }
}
