import java.util.*;

public class App {

    public static void main(String[] args) {

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("111.111.111-01",
                "João", 1));
        alunos.add(new Aluno("111.111.111-01",
                "João", 1));
        alunos.add(new Aluno("222.222.222-02",
                "Maria", 2));
        System.out.println(alunos);

    }

}
