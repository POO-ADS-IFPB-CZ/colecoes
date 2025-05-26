import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    private Queue<Ficha> fichas;

    public Fila(){
        fichas = new LinkedList<>();
    }

    public boolean adicionar(Ficha ficha){
        return fichas.offer(ficha);
    }

    public Ficha inspecionar(){
        return fichas.peek();
    }

    public Ficha chamarProximo(){
        return fichas.poll();
    }

}
