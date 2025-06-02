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

        //COMO
        Pessoa menorPessoa = pessoas.get(0);
        for(int i=0; i<pessoas.size(); i++){
            if(pessoas.get(i).getNascimento()
                    .isAfter(menorPessoa.getNascimento())){
                menorPessoa = pessoas.get(i);
            }
        }
        System.out.println(menorPessoa);

        //O QUE
        System.out.println(pessoas.stream()
                .min(Comparator.comparing(Pessoa::getNascimento)));

    }

}
