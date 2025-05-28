import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<Musica> musicas;
    private String nome;

    public PlayList(String nome){
        this.nome = nome;
        musicas = new ArrayList<>();
    }

    //TODO: Criar métodos para remover, atualizar músicas...
    public boolean adicionarMusica(Musica musica){
        return musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "musicas=" + musicas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
