import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Esther");
        listaDeNomes.add("Fulano");
        listaDeNomes.add("Beltrano");
        listaDeNomes.add("Siclano");
        listaDeNomes.add("Biel");
        listaDeNomes.add("Fiuza");
        listaDeNomes.add("Diego");
        listaDeNomes.add("Henrique");

        System.out.println("Lista Original: " + listaDeNomes);

        Eliminar.eliminarMetade(listaDeNomes);

        System.out.println("Lista Após Remoção: " + listaDeNomes);
    }
}
