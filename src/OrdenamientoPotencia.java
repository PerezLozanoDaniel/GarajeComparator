import java.util.Comparator;

public class OrdenamientoPotencia implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.potencia-o2.potencia;
    }
}

