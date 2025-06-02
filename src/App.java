import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        String texto = "A casa branca estava cheia de flores rosas " +
                "e a luz solar entrava pelas janelas iluminando " +
                "cada cantinho um dia ensolarado perfeito para uma " +
                "festa";

        Arrays.stream(texto.toUpperCase().split(" "))
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }

}
