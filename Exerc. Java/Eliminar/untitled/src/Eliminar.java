import java.util.ArrayList;
import java.util.List;

public class Eliminar {
    public static void eliminarMetade(List<String> lista) {
        int tamanhoOriginal = lista.size();
        int tamanhoFinal = tamanhoOriginal / 2;

        lista.subList(tamanhoFinal, tamanhoOriginal).clear();
    }
}
