import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> nomes = List.of("João","Maria",
                "Pedro", "José", "Ana", "Paulo");

        nomes.stream()
                .filter(n -> n.startsWith("P"))
                .forEach(n -> System.out.println(n));

        for(String nome: nomes){
            if(nome.startsWith("P")){
                System.out.println(nome);
            }
        }

    }

}
