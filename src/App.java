import java.util.*;

public class App {

    public static void main(String[] args) {

        Professor professor = new Professor("111.111.111-01",
                "João", 5000);
        Turma poo = new Turma(professor, "POO");
        poo.adicionarAluno(new Aluno("222.222.222-02",
                "Maria", 1));
        poo.adicionarAluno(new Aluno("333.333.333-03",
                "José", 2));
        System.out.println(poo);

    }

}
