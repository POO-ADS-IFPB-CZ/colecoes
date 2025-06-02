import java.time.LocalDate;
import java.util.*;

public class App {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("111.111.111-01",
        "João", LocalDate.of(2000,6,12)));
        pessoas.add(new Pessoa("333.333.333-03",
        "Maria", LocalDate.of(1999,10,5)));
        pessoas.add(new Pessoa("222.222.222-02",
        "Ana", LocalDate.of(2001,6,2)));

        Collections.sort(pessoas,
                Comparator.comparing(Pessoa::getCpf));
        System.out.println(pessoas);


    }

}
