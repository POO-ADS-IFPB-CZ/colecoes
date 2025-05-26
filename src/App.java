import java.util.*;

public class App {

    public static void main(String[] args) {

        Queue<String> minhaFila = new LinkedList<>();
        minhaFila.offer("João");
        minhaFila.offer("Maria");
        minhaFila.offer("Pedro");
        minhaFila.offer("Ana");

        System.out.println("Retorna o primeiro:"+minhaFila.peek());

        while(!minhaFila.isEmpty()) {
            System.out.println(minhaFila.poll());
        }

    }

}
