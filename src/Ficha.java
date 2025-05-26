import java.time.LocalDateTime;

public class Ficha {

    private static int contFicha;
    private final int numero;
    private String cliente;
    private final LocalDateTime dataHora;

    public Ficha(String cliente){
        numero = ++contFicha;
        this.cliente = cliente;
        dataHora = LocalDateTime.now();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
