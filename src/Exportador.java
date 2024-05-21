import java.util.ArrayList;
import java.io.IOException;

public abstract class Exportador {
    public abstract void exportar(ArrayList<Producto> listaProductos, String archivo) throws IOException;
}
