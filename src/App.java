import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();
        //CREATE
        lista.add("João");
        lista.add("Maria");
        lista.add(1, "Pedro");
        //READ
        System.out.println(lista);
        System.out.println(lista.get(0));
        //DELETE
        lista.remove("João");
        System.out.println(lista);
        System.out.println(lista.indexOf("Maria"));
        System.out.println(lista.contains("Maria"));
        //UPDATE
        lista.set(1, "Maria da Silva");
        System.out.println(lista);
        lista.add("Ana");
        lista.add("José");

        for(String s : lista){
            System.out.println(s);
        }

    }

}
