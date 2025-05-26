import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;
    private String disciplina;

    public Turma(Professor professor, String disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        alunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public boolean adicionarAluno(Aluno aluno){
        return alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "professor=" + professor +
                ", alunos=" + alunos +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
