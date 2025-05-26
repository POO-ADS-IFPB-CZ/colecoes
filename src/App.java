import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        while(true){
            System.out.println("Escolha a opção:" +
                    "\n1 - Nova ficha" +
                    "\n2 - Ver próximo" +
                    "\n3 - Chamar próximo" +
                    "\n4 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch(escolha){
                case 1 ->{
                    System.out.println("Informe o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    Ficha ficha = new Ficha(nomeCliente);
                    fila.adicionar(ficha);
                }
                //TODO: Tratar mensagens de sucesso e erro
                case 2 -> System.out.println(fila.inspecionar());
                case 3 -> System.out.println(fila.chamarProximo());
                case 4 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }

        }

    }

}
