import java.util.*;

public class App {

    public static void main(String[] args) {

        PlayList playList = new PlayList("Minhas músicas");

        playList.adicionarMusica(new Musica("Gostava tanto de você",
                "Tim Maia", 1973));
        playList.adicionarMusica(new Musica("Leviana",
                "Zezo", 2000));
        playList.adicionarMusica(new Musica("Nothing else matters",
                "Metallica", 1991));

        playList.ordenarPorAno();
        System.out.println(playList);

    }

}
