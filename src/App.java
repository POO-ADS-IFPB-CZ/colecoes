import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("111.111.111-01",
        "João", LocalDate.of(2000,6,12)));
        pessoas.add(new Pessoa("333.333.333-03",
        "Maria", LocalDate.of(1999,10,5)));
        pessoas.add(new Pessoa("222.222.222-02",
        "Ana", LocalDate.of(2010,6,2)));

        pessoas.stream().map(p -> p.getIdade())
                .sorted().forEach(System.out::println);

    }

}
