import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class App {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> numeros = rand.ints(30,
                        0,
                        100)
                .boxed().toList();
        System.out.println(numeros);
        List<Integer> crescente = numeros.stream().sorted()
                .collect(toList());
        System.out.println(crescente);
        System.out.println(crescente.reversed());



    }

}
